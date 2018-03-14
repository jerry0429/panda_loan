package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.LandingDeviceLog;
import com.pinganzhiyuan.model.LandingDeviceLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface LandingDeviceLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	long countByExample(LandingDeviceLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int deleteByExample(LandingDeviceLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Delete({ "delete from landing_device_log", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Insert({ "insert into landing_device_log (url, ip, ", "landing_channel_id, landing_channel_uid, ",
			"h5_app_id, p_id, user_id, ", "user_agent, sid)",
			"values (#{url,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, ",
			"#{landingChannelId,jdbcType=BIGINT}, #{landingChannelUid,jdbcType=VARCHAR}, ",
			"#{h5AppId,jdbcType=BIGINT}, #{pId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
			"#{userAgent,jdbcType=VARCHAR}, #{sid,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(LandingDeviceLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int insertSelective(LandingDeviceLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	List<LandingDeviceLog> selectByExample(LandingDeviceLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Select({ "select", "id, url, ip, landing_channel_id, landing_channel_uid, h5_app_id, p_id, user_id, ",
			"user_agent, sid", "from landing_device_log", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.LandingDeviceLogMapper.BaseResultMap")
	LandingDeviceLog selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByExampleSelective(@Param("record") LandingDeviceLog record,
			@Param("example") LandingDeviceLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByExample(@Param("record") LandingDeviceLog record, @Param("example") LandingDeviceLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByPrimaryKeySelective(LandingDeviceLog record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table landing_device_log
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Update({ "update landing_device_log", "set url = #{url,jdbcType=VARCHAR},", "ip = #{ip,jdbcType=VARCHAR},",
			"landing_channel_id = #{landingChannelId,jdbcType=BIGINT},",
			"landing_channel_uid = #{landingChannelUid,jdbcType=VARCHAR},", "h5_app_id = #{h5AppId,jdbcType=BIGINT},",
			"p_id = #{pId,jdbcType=BIGINT},", "user_id = #{userId,jdbcType=BIGINT},",
			"user_agent = #{userAgent,jdbcType=VARCHAR},", "sid = #{sid,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(LandingDeviceLog record);
}