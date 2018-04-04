package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Column;
import com.pinganzhiyuan.model.ColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ColumnMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	long countByExample(ColumnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int deleteByExample(ColumnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Delete({ "delete from app_column", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Insert({ "insert into app_column (column_key, name, ", "title, subtitle, ", "url, icon_url, max)",
			"values (#{columnKey,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
			"#{title,jdbcType=VARCHAR}, #{subtitle,jdbcType=VARCHAR}, ",
			"#{url,jdbcType=VARCHAR}, #{iconUrl,jdbcType=VARCHAR}, #{max,jdbcType=INTEGER})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Column record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int insertSelective(Column record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	List<Column> selectByExample(ColumnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Select({ "select", "id, column_key, name, title, subtitle, url, icon_url, max", "from app_column",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.ColumnMapper.BaseResultMap")
	Column selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Column record, @Param("example") ColumnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByExample(@Param("record") Column record, @Param("example") ColumnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByPrimaryKeySelective(Column record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_column
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Update({ "update app_column", "set column_key = #{columnKey,jdbcType=VARCHAR},",
			"name = #{name,jdbcType=VARCHAR},", "title = #{title,jdbcType=VARCHAR},",
			"subtitle = #{subtitle,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"icon_url = #{iconUrl,jdbcType=VARCHAR},", "max = #{max,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Column record);
}