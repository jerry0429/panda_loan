package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Product;
import com.pinganzhiyuan.model.ProductExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import com.pinganzhiyuan.model.ProductKey;

public interface ProductMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	long countByExample(ProductExample example);
	
	/**
	 * @param example
	 * @return
	 */
	List<Product> associateWithH5ProductColumnMapping(Map map);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	int deleteByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	@Delete({ "delete from product", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	@Insert({ "insert into product (title, is_new, ", "first_tags, second_tags, ", "description, is_published, ",
			"img_url, url, weight, ", "light_title, edu, ", "min_amount, max_amount, ", "min_term, max_term, ",
			"low_interest, high_interest, ", "credit_auth, lender_name, ", "lender_desc, active_captcha_url, ",
			"reg_interface_url, publish_time, ", "unpublish_time, display_type, ", "charge_mode_id, apply_times, ",
			"loan_wait_time, app_client_ids)", "values (#{title,jdbcType=VARCHAR}, #{isNew,jdbcType=BIT}, ",
			"#{firstTags,jdbcType=VARCHAR}, #{secondTags,jdbcType=VARCHAR}, ",
			"#{description,jdbcType=VARCHAR}, #{isPublished,jdbcType=BIT}, ",
			"#{imgUrl,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{weight,jdbcType=INTEGER}, ",
			"#{lightTitle,jdbcType=VARCHAR}, #{edu,jdbcType=VARCHAR}, ",
			"#{minAmount,jdbcType=INTEGER}, #{maxAmount,jdbcType=INTEGER}, ",
			"#{minTerm,jdbcType=INTEGER}, #{maxTerm,jdbcType=INTEGER}, ",
			"#{lowInterest,jdbcType=DOUBLE}, #{highInterest,jdbcType=DOUBLE}, ",
			"#{creditAuth,jdbcType=VARCHAR}, #{lenderName,jdbcType=VARCHAR}, ",
			"#{lenderDesc,jdbcType=VARCHAR}, #{activeCaptchaUrl,jdbcType=VARCHAR}, ",
			"#{regInterfaceUrl,jdbcType=VARCHAR}, #{publishTime,jdbcType=TIMESTAMP}, ",
			"#{unpublishTime,jdbcType=TIMESTAMP}, #{displayType,jdbcType=TINYINT}, ",
			"#{chargeModeId,jdbcType=BIGINT}, #{applyTimes,jdbcType=INTEGER}, ",
			"#{loanWaitTime,jdbcType=INTEGER}, #{appClientIds,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	int insertSelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	List<Product> selectByExample(ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	@Select({ "select", "id, title, is_new, first_tags, second_tags, description, is_published, img_url, ",
			"url, weight, light_title, edu, min_amount, max_amount, min_term, max_term, low_interest, ",
			"high_interest, credit_auth, lender_name, lender_desc, active_captcha_url, reg_interface_url, ",
			"publish_time, unpublish_time, display_type, charge_mode_id, apply_times, loan_wait_time, ",
			"app_client_ids", "from product", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.ProductMapper.BaseResultMap")
	Product selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	int updateByPrimaryKeySelective(Product record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Mar 19 14:11:15 CST 2018
	 */
	@Update({ "update product", "set title = #{title,jdbcType=VARCHAR},", "is_new = #{isNew,jdbcType=BIT},",
			"first_tags = #{firstTags,jdbcType=VARCHAR},", "second_tags = #{secondTags,jdbcType=VARCHAR},",
			"description = #{description,jdbcType=VARCHAR},", "is_published = #{isPublished,jdbcType=BIT},",
			"img_url = #{imgUrl,jdbcType=VARCHAR},", "url = #{url,jdbcType=VARCHAR},",
			"weight = #{weight,jdbcType=INTEGER},", "light_title = #{lightTitle,jdbcType=VARCHAR},",
			"edu = #{edu,jdbcType=VARCHAR},", "min_amount = #{minAmount,jdbcType=INTEGER},",
			"max_amount = #{maxAmount,jdbcType=INTEGER},", "min_term = #{minTerm,jdbcType=INTEGER},",
			"max_term = #{maxTerm,jdbcType=INTEGER},", "low_interest = #{lowInterest,jdbcType=DOUBLE},",
			"high_interest = #{highInterest,jdbcType=DOUBLE},", "credit_auth = #{creditAuth,jdbcType=VARCHAR},",
			"lender_name = #{lenderName,jdbcType=VARCHAR},", "lender_desc = #{lenderDesc,jdbcType=VARCHAR},",
			"active_captcha_url = #{activeCaptchaUrl,jdbcType=VARCHAR},",
			"reg_interface_url = #{regInterfaceUrl,jdbcType=VARCHAR},",
			"publish_time = #{publishTime,jdbcType=TIMESTAMP},",
			"unpublish_time = #{unpublishTime,jdbcType=TIMESTAMP},", "display_type = #{displayType,jdbcType=TINYINT},",
			"charge_mode_id = #{chargeModeId,jdbcType=BIGINT},", "apply_times = #{applyTimes,jdbcType=INTEGER},",
			"loan_wait_time = #{loanWaitTime,jdbcType=INTEGER},", "app_client_ids = #{appClientIds,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Product record);

	/**
     * 根据app与渠道进行筛选
     * @param id
     * @return
     */
    @Select({ "select * from product where FIND_IN_SET(#{allowAppId}, app_client_ids) and is_published = true order by weight desc" })
    @ResultMap("com.pinganzhiyuan.mapper.ProductMapper.BaseResultMap")
    List<Product> selectHotProducts(@Param("allowAppId") Long allowAppId);
    
    
//	/**
//     * 根据h5产品渠道筛选产品
//     * @param id
//     * @return
//     */
//    @Select({ "select * from product as a join h5_product_column_mapping as b \n" + 
//    		"on a.id = b.product_id\n" + 
//    		"where a.id in (107, 121, 153)\n" + 
//    		"and a.is_published = 1\n" + 
//    		"order by b.sequence" })
//    @ResultMap("com.pinganzhiyuan.mapper.ProductMapper.BaseResultMap")
//    List<Product> selectHotProducts(@Param("allowAppId") Long allowAppId);
}