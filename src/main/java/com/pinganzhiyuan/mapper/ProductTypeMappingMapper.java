package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.ProductTypeMapping;
import com.pinganzhiyuan.model.ProductTypeMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ProductTypeMappingMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    long countByExample(ProductTypeMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    int deleteByExample(ProductTypeMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    @Delete({ "delete from product_type_mapping", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    @Insert({ "insert into product_type_mapping (product_id, type_id)",
            "values (#{productId,jdbcType=BIGINT}, #{typeId,jdbcType=BIGINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(ProductTypeMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    int insertSelective(ProductTypeMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    List<ProductTypeMapping> selectByExample(ProductTypeMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    @Select({ "select", "id, product_id, type_id", "from product_type_mapping", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.ProductTypeMappingMapper.BaseResultMap")
    ProductTypeMapping selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductTypeMapping record,
            @Param("example") ProductTypeMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    int updateByExample(@Param("record") ProductTypeMapping record,
            @Param("example") ProductTypeMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    int updateByPrimaryKeySelective(ProductTypeMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table product_type_mapping
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    @Update({ "update product_type_mapping", "set product_id = #{productId,jdbcType=BIGINT},",
            "type_id = #{typeId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(ProductTypeMapping record);
}