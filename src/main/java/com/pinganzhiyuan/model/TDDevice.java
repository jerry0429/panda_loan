package com.pinganzhiyuan.model;

import java.util.Date;

public class TDDevice {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.package_name
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String packageName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.channel_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private Long channelId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.device_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String deviceId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.send_flag
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private Boolean sendFlag;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column td_device.regist_date
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private Date registDate;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.id
     * @return  the value of td_device.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.id
     * @param id  the value for td_device.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.package_name
     * @return  the value of td_device.package_name
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.package_name
     * @param packageName  the value for td_device.package_name
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.channel_id
     * @return  the value of td_device.channel_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.channel_id
     * @param channelId  the value for td_device.channel_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.device_id
     * @return  the value of td_device.device_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.device_id
     * @param deviceId  the value for td_device.device_id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.send_flag
     * @return  the value of td_device.send_flag
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public Boolean getSendFlag() {
        return sendFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.send_flag
     * @param sendFlag  the value for td_device.send_flag
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setSendFlag(Boolean sendFlag) {
        this.sendFlag = sendFlag;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column td_device.regist_date
     * @return  the value of td_device.regist_date
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public Date getRegistDate() {
        return registDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column td_device.regist_date
     * @param registDate  the value for td_device.regist_date
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }
}