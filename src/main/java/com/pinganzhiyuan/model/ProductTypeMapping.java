package com.pinganzhiyuan.model;

public class ProductTypeMapping {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_type_mapping.id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_type_mapping.product_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_type_mapping.type_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	private Long typeId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_type_mapping.id
	 * @return  the value of product_type_mapping.id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_type_mapping.id
	 * @param id  the value for product_type_mapping.id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_type_mapping.product_id
	 * @return  the value of product_type_mapping.product_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_type_mapping.product_id
	 * @param productId  the value for product_type_mapping.product_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_type_mapping.type_id
	 * @return  the value of product_type_mapping.type_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public Long getTypeId() {
		return typeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_type_mapping.type_id
	 * @param typeId  the value for product_type_mapping.type_id
	 * @mbg.generated  Fri Mar 23 10:35:06 CST 2018
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
}