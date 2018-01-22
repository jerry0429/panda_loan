package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.LoanAmountRange;
import com.pinganzhiyuan.model.LoanAmountRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface LoanAmountRangeMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    long countByExample(LoanAmountRangeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int deleteByExample(LoanAmountRangeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Delete({ "delete from loan_amount_range", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Insert({ "insert into loan_amount_range (min_amount, max_amount, ", "sequency)",
            "values (#{minAmount,jdbcType=INTEGER}, #{maxAmount,jdbcType=INTEGER}, ", "#{sequency,jdbcType=INTEGER})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(LoanAmountRange record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int insertSelective(LoanAmountRange record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    List<LoanAmountRange> selectByExample(LoanAmountRangeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Select({ "select", "id, min_amount, max_amount, sequency", "from loan_amount_range",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.LoanAmountRangeMapper.BaseResultMap")
    LoanAmountRange selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") LoanAmountRange record,
            @Param("example") LoanAmountRangeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByExample(@Param("record") LoanAmountRange record, @Param("example") LoanAmountRangeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    int updateByPrimaryKeySelective(LoanAmountRange record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table loan_amount_range
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    @Update({ "update loan_amount_range", "set min_amount = #{minAmount,jdbcType=INTEGER},",
            "max_amount = #{maxAmount,jdbcType=INTEGER},", "sequency = #{sequency,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(LoanAmountRange record);
}