package com.pinganzhiyuan.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pinganzhiyuan.mapper.DeviceLogMapper;
import com.pinganzhiyuan.mapper.LenderAccessLogMapper;
import com.pinganzhiyuan.model.DeviceLog;
import com.pinganzhiyuan.model.DeviceLogExample;
import com.pinganzhiyuan.model.LenderAccessLog;
import com.pinganzhiyuan.util.WebUtils;

public class DeviceInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LogManager.getLogger(DeviceInterceptor.class);

    @Autowired
    private DeviceLogMapper deviceLogMapper;

    @Autowired
    private LenderAccessLogMapper lenderAccessLogMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        MultiReadHttpServletRequest multiReadRequest = new MultiReadHttpServletRequest((HttpServletRequest) request);
        request = multiReadRequest;

        if (request.getMethod().equals("OPTIONS")) {

        } else {

            // WebUtils.getHeadersInfo(request);

            String version = request.getHeader("Version");
            String userId = request.getHeader("User-Id");
            String userAgent = request.getHeader("User-Agent");
            String channelId = request.getHeader("Channel-Id");
            String deviceId = request.getHeader("Device-Id");
            String uri = request.getHeader("Request-Uri");

            // 如果有代理转发，则获取代理转发的地址
            String ip = request.getHeader("x-real-ip");
            if (ip == null) {
                ip = request.getRemoteAddr();
            }
            // String uri = request.getRequestURI();

            if (version == null || userId == null || channelId == null || userAgent == null || deviceId == null
                    || uri == null) {
                return false;
            }

            // String redirectUri = request.getParameter("redirect");
            // if (redirectUri == null) {
            // } else {
            // redirectUri = URLDecoder.decode(redirectUri);
            // try {
            // LenderAccessLog log = new LenderAccessLog();
            //
            // log.setLenderUrl(redirectUri);
            // lenderAccessLogMapper.insert(log);
            // response.sendRedirect(redirectUri);
            // } catch (IOException e) {
            // e.printStackTrace();
            // }
            // }

            // InputStream is = null;
            // String body = "";
            //
            // try {
            // is = request.getInputStream();
            // StringBuffer out = new StringBuffer();
            // byte[] b = new byte[4096];
            // for (int n; (n = is.read(b)) != -1;) {
            // out.append(new String(b, 0, n));
            // }
            // body = out.toString();
            //
            //
            // } catch (IOException e) {
            // e.printStackTrace();
            // }

            String strPageId = request.getParameter("pageId");
            if (strPageId == null) {
                strPageId = "0";
            }

            String packageName = request.getHeader("Package-Name");
            if (packageName == null) {
                packageName = "";
            }
            
            String jPushId = request.getHeader("Jpush-Id");
            if (jPushId == null) {
                jPushId = "";
            }
            
            int pageId = Integer.valueOf(strPageId);
            DeviceLog deviceLog = new DeviceLog();
            deviceLog.setVersion(Integer.valueOf(version));
            deviceLog.setChannelId(Long.valueOf(channelId));
            deviceLog.setUserId(Long.valueOf(userId));
            deviceLog.setUserAgent(userAgent);
            deviceLog.setIp(ip);
            deviceLog.setUri(uri);
            deviceLog.setPackageName(packageName);
            deviceLog.setPageId(pageId);
            deviceLog.setDeviceId(deviceId);
            deviceLog.setJpushId(jPushId);

            String ll = request.getHeader("Long-Lat");
            if (ll != null) {
                String[] llArr = ll.split("\\|");
                Double longitude = Double.valueOf(llArr[0]);
                Double latitude = Double.valueOf(llArr[1]);

                deviceLog.setLongitude(longitude);
                deviceLog.setLatitude(latitude);
            }

            String geoInfo = null;
            geoInfo = request.getHeader("Geo");
            if (geoInfo != null) {
                deviceLog.setGeoInfo(geoInfo);
            }

            String pId = request.getParameter("pid");
            if (pId == null) {
                pId = request.getHeader("Pid");
            }
            if (pId != null) {
                deviceLog.setpId(Long.valueOf(pId));
            }

            String isWebview = request.getHeader("Is-Webview");
            if (isWebview != null) {
                deviceLog.setIsWebview(Byte.valueOf(isWebview));
            }

            String sid = request.getHeader("Sid");
            if (sid != null) {
                deviceLog.setSid(sid);
            }

            deviceLogMapper.insert(deviceLog);
        }

        return super.preHandle(request, response, handler);
    }

}
