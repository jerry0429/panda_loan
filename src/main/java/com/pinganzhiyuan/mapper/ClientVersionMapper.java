package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.ClientVersion;
import com.pinganzhiyuan.model.ClientVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ClientVersionMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    long countByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    int deleteByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    @Delete({ "delete from client_version", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    @Insert({ "insert into client_version (version_name, version_code, ", "change_log, is_forced, ",
            "download_url, is_published, ", "platform_id, package_name, ", "channel_id, mask_switch, ", "publish_time)",
            "values (#{versionName,jdbcType=VARCHAR}, #{versionCode,jdbcType=INTEGER}, ",
            "#{changeLog,jdbcType=VARCHAR}, #{isForced,jdbcType=BIT}, ",
            "#{downloadUrl,jdbcType=VARCHAR}, #{isPublished,jdbcType=BIT}, ",
            "#{platformId,jdbcType=TINYINT}, #{packageName,jdbcType=VARCHAR}, ",
            "#{channelId,jdbcType=INTEGER}, #{maskSwitch,jdbcType=BIT}, ", "#{publishTime,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    int insertSelective(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    List<ClientVersion> selectByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    @Select({ "select", "id, version_name, version_code, change_log, is_forced, download_url, is_published, ",
            "platform_id, package_name, channel_id, mask_switch, publish_time", "from client_version",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.ClientVersionMapper.BaseResultMap")
    ClientVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    int updateByExampleSelective(@Param("record") ClientVersion record, @Param("example") ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    int updateByExample(@Param("record") ClientVersion record, @Param("example") ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    int updateByPrimaryKeySelective(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client_version
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    @Update({ "update client_version", "set version_name = #{versionName,jdbcType=VARCHAR},",
            "version_code = #{versionCode,jdbcType=INTEGER},", "change_log = #{changeLog,jdbcType=VARCHAR},",
            "is_forced = #{isForced,jdbcType=BIT},", "download_url = #{downloadUrl,jdbcType=VARCHAR},",
            "is_published = #{isPublished,jdbcType=BIT},", "platform_id = #{platformId,jdbcType=TINYINT},",
            "package_name = #{packageName,jdbcType=VARCHAR},", "channel_id = #{channelId,jdbcType=INTEGER},",
            "mask_switch = #{maskSwitch,jdbcType=BIT},", "publish_time = #{publishTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(ClientVersion record);
}