package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.H5ClientVersion;
import com.pinganzhiyuan.model.H5ClientVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface H5ClientVersionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	long countByExample(H5ClientVersionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int deleteByExample(H5ClientVersionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Delete({ "delete from h5_client_version", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Insert({ "insert into h5_client_version (name, logo_url, ", "change_log, client_version_id, ",
			"h5_channel_id, h5_app_id, ", "platform_id, is_published, ", "publish_time)",
			"values (#{name,jdbcType=VARCHAR}, #{logoUrl,jdbcType=VARCHAR}, ",
			"#{changeLog,jdbcType=VARCHAR}, #{clientVersionId,jdbcType=BIGINT}, ",
			"#{h5ChannelId,jdbcType=BIGINT}, #{h5AppId,jdbcType=BIGINT}, ",
			"#{platformId,jdbcType=TINYINT}, #{isPublished,jdbcType=BIT}, ", "#{publishTime,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(H5ClientVersion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int insertSelective(H5ClientVersion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	List<H5ClientVersion> selectByExample(H5ClientVersionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Select({ "select", "id, name, logo_url, change_log, client_version_id, h5_channel_id, h5_app_id, ",
			"platform_id, is_published, publish_time", "from h5_client_version", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.H5ClientVersionMapper.BaseResultMap")
	H5ClientVersion selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByExampleSelective(@Param("record") H5ClientVersion record,
			@Param("example") H5ClientVersionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByExample(@Param("record") H5ClientVersion record, @Param("example") H5ClientVersionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	int updateByPrimaryKeySelective(H5ClientVersion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_version
	 * @mbg.generated  Wed Mar 14 19:06:52 CST 2018
	 */
	@Update({ "update h5_client_version", "set name = #{name,jdbcType=VARCHAR},",
			"logo_url = #{logoUrl,jdbcType=VARCHAR},", "change_log = #{changeLog,jdbcType=VARCHAR},",
			"client_version_id = #{clientVersionId,jdbcType=BIGINT},",
			"h5_channel_id = #{h5ChannelId,jdbcType=BIGINT},", "h5_app_id = #{h5AppId,jdbcType=BIGINT},",
			"platform_id = #{platformId,jdbcType=TINYINT},", "is_published = #{isPublished,jdbcType=BIT},",
			"publish_time = #{publishTime,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(H5ClientVersion record);
}