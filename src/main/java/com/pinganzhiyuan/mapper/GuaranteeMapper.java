package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Guarantee;
import com.pinganzhiyuan.model.GuaranteeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GuaranteeMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    long countByExample(GuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int deleteByExample(GuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Delete({ "delete from guarantee", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Insert({ "insert into guarantee (credit_guarantee, squency)",
            "values (#{creditGuarantee,jdbcType=VARCHAR}, #{squency,jdbcType=TINYINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Guarantee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int insertSelective(Guarantee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    List<Guarantee> selectByExample(GuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Select({ "select", "id, credit_guarantee, squency", "from guarantee", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.GuaranteeMapper.BaseResultMap")
    Guarantee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") Guarantee record, @Param("example") GuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByExample(@Param("record") Guarantee record, @Param("example") GuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByPrimaryKeySelective(Guarantee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Update({ "update guarantee", "set credit_guarantee = #{creditGuarantee,jdbcType=VARCHAR},",
            "squency = #{squency,jdbcType=TINYINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Guarantee record);
}