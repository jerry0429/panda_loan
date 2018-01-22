package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.MidNav;
import com.pinganzhiyuan.model.MidNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface MidNavMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    long countByExample(MidNavExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int deleteByExample(MidNavExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Delete({ "delete from mid_nav", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Insert({ "insert into mid_nav (title, subtitle, ", "icon_url, url, product_id)",
            "values (#{title,jdbcType=VARCHAR}, #{subtitle,jdbcType=VARCHAR}, ",
            "#{iconUrl,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{productId,jdbcType=BIGINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(MidNav record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int insertSelective(MidNav record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    List<MidNav> selectByExample(MidNavExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Select({ "select", "id, title, subtitle, icon_url, url, product_id", "from mid_nav",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.MidNavMapper.BaseResultMap")
    MidNav selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") MidNav record, @Param("example") MidNavExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByExample(@Param("record") MidNav record, @Param("example") MidNavExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByPrimaryKeySelective(MidNav record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table mid_nav
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Update({ "update mid_nav", "set title = #{title,jdbcType=VARCHAR},", "subtitle = #{subtitle,jdbcType=VARCHAR},",
            "icon_url = #{iconUrl,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
            "product_id = #{productId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(MidNav record);
}