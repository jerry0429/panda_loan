package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.H5AppClient;
import com.pinganzhiyuan.model.H5AppClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface H5AppClientMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	long countByExample(H5AppClientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	int deleteByExample(H5AppClientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	@Delete({ "delete from h5_app", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	@Insert({ "insert into h5_app (name, note)", "values (#{name,jdbcType=VARCHAR}, #{note,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(H5AppClient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	int insertSelective(H5AppClient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	List<H5AppClient> selectByExample(H5AppClientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	@Select({ "select", "id, name, note", "from h5_app", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.H5AppClientMapper.BaseResultMap")
	H5AppClient selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	int updateByExampleSelective(@Param("record") H5AppClient record, @Param("example") H5AppClientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	int updateByExample(@Param("record") H5AppClient record, @Param("example") H5AppClientExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	int updateByPrimaryKeySelective(H5AppClient record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	@Update({ "update h5_app", "set name = #{name,jdbcType=VARCHAR},", "note = #{note,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(H5AppClient record);
}