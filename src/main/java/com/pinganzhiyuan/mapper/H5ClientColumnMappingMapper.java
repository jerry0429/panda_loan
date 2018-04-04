package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.H5ClientColumnMapping;
import com.pinganzhiyuan.model.H5ClientColumnMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface H5ClientColumnMappingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	long countByExample(H5ClientColumnMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int deleteByExample(H5ClientColumnMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Delete({ "delete from h5_client_column_mapping", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Insert({ "insert into h5_client_column_mapping (h5_column_key, h5_client_version_id, ", "status)",
			"values (#{h5ColumnKey,jdbcType=VARCHAR}, #{h5ClientVersionId,jdbcType=BIGINT}, ",
			"#{status,jdbcType=TINYINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(H5ClientColumnMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int insertSelective(H5ClientColumnMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	List<H5ClientColumnMapping> selectByExample(H5ClientColumnMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Select({ "select", "id, h5_column_key, h5_client_version_id, status", "from h5_client_column_mapping",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.H5ClientColumnMappingMapper.BaseResultMap")
	H5ClientColumnMapping selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByExampleSelective(@Param("record") H5ClientColumnMapping record,
			@Param("example") H5ClientColumnMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByExample(@Param("record") H5ClientColumnMapping record,
			@Param("example") H5ClientColumnMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	int updateByPrimaryKeySelective(H5ClientColumnMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_client_column_mapping
	 * @mbg.generated  Wed Apr 04 16:23:39 CST 2018
	 */
	@Update({ "update h5_client_column_mapping", "set h5_column_key = #{h5ColumnKey,jdbcType=VARCHAR},",
			"h5_client_version_id = #{h5ClientVersionId,jdbcType=BIGINT},", "status = #{status,jdbcType=TINYINT}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(H5ClientColumnMapping record);
}