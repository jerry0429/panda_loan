package com.pinganzhiyuan.model;

public class H5ProductClientVersionMapping {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column h5_product_client_version_mapping.id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column h5_product_client_version_mapping.h5_client_version_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	private Long h5ClientVersionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column h5_product_client_version_mapping.product_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column h5_product_client_version_mapping.status
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	private Byte status;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column h5_product_client_version_mapping.id
	 * @return  the value of h5_product_client_version_mapping.id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column h5_product_client_version_mapping.id
	 * @param id  the value for h5_product_client_version_mapping.id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column h5_product_client_version_mapping.h5_client_version_id
	 * @return  the value of h5_product_client_version_mapping.h5_client_version_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public Long getH5ClientVersionId() {
		return h5ClientVersionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column h5_product_client_version_mapping.h5_client_version_id
	 * @param h5ClientVersionId  the value for h5_product_client_version_mapping.h5_client_version_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public void setH5ClientVersionId(Long h5ClientVersionId) {
		this.h5ClientVersionId = h5ClientVersionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column h5_product_client_version_mapping.product_id
	 * @return  the value of h5_product_client_version_mapping.product_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column h5_product_client_version_mapping.product_id
	 * @param productId  the value for h5_product_client_version_mapping.product_id
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column h5_product_client_version_mapping.status
	 * @return  the value of h5_product_client_version_mapping.status
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column h5_product_client_version_mapping.status
	 * @param status  the value for h5_product_client_version_mapping.status
	 * @mbg.generated  Tue Mar 20 16:02:34 CST 2018
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}
}