package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.DeviceLog;
import com.pinganzhiyuan.model.DeviceLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DeviceLogMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    long countByExample(DeviceLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    int deleteByExample(DeviceLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    @Delete({ "delete from device_log", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    @Insert({ "insert into device_log (uri, page_id, ", "p_id, user_id, ip, ", "device_id, user_agent, ",
            "url_type, sid, is_webview, ", "version, channel_id, ", "package_name, longitude, ", "latitude, geo_info)",
            "values (#{uri,jdbcType=VARCHAR}, #{pageId,jdbcType=INTEGER}, ",
            "#{pId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{ip,jdbcType=VARCHAR}, ",
            "#{deviceId,jdbcType=VARCHAR}, #{userAgent,jdbcType=VARCHAR}, ",
            "#{urlType,jdbcType=TINYINT}, #{sid,jdbcType=VARCHAR}, #{isWebview,jdbcType=TINYINT}, ",
            "#{version,jdbcType=INTEGER}, #{channelId,jdbcType=BIGINT}, ",
            "#{packageName,jdbcType=VARCHAR}, #{longitude,jdbcType=DOUBLE}, ",
            "#{latitude,jdbcType=DOUBLE}, #{geoInfo,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(DeviceLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    int insertSelective(DeviceLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    List<DeviceLog> selectByExample(DeviceLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    @Select({ "select", "id, uri, page_id, p_id, user_id, ip, device_id, user_agent, url_type, sid, is_webview, ",
            "version, channel_id, package_name, longitude, latitude, geo_info", "from device_log",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.DeviceLogMapper.BaseResultMap")
    DeviceLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") DeviceLog record, @Param("example") DeviceLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    int updateByExample(@Param("record") DeviceLog record, @Param("example") DeviceLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    int updateByPrimaryKeySelective(DeviceLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table device_log
     * @mbg.generated  Fri Dec 29 14:24:42 CST 2017
     */
    @Update({ "update device_log", "set uri = #{uri,jdbcType=VARCHAR},", "page_id = #{pageId,jdbcType=INTEGER},",
            "p_id = #{pId,jdbcType=BIGINT},", "user_id = #{userId,jdbcType=BIGINT},", "ip = #{ip,jdbcType=VARCHAR},",
            "device_id = #{deviceId,jdbcType=VARCHAR},", "user_agent = #{userAgent,jdbcType=VARCHAR},",
            "url_type = #{urlType,jdbcType=TINYINT},", "sid = #{sid,jdbcType=VARCHAR},",
            "is_webview = #{isWebview,jdbcType=TINYINT},", "version = #{version,jdbcType=INTEGER},",
            "channel_id = #{channelId,jdbcType=BIGINT},", "package_name = #{packageName,jdbcType=VARCHAR},",
            "longitude = #{longitude,jdbcType=DOUBLE},", "latitude = #{latitude,jdbcType=DOUBLE},",
            "geo_info = #{geoInfo,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(DeviceLog record);
}