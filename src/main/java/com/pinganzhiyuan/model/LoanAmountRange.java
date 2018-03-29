package com.pinganzhiyuan.model;

public class LoanAmountRange {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column loan_amount_range.id
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column loan_amount_range.min_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	private Integer minAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column loan_amount_range.max_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	private Integer maxAmount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column loan_amount_range.sequency
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	private Integer sequency;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column loan_amount_range.id
	 * @return  the value of loan_amount_range.id
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column loan_amount_range.id
	 * @param id  the value for loan_amount_range.id
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column loan_amount_range.min_amount
	 * @return  the value of loan_amount_range.min_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public Integer getMinAmount() {
		return minAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column loan_amount_range.min_amount
	 * @param minAmount  the value for loan_amount_range.min_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column loan_amount_range.max_amount
	 * @return  the value of loan_amount_range.max_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public Integer getMaxAmount() {
		return maxAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column loan_amount_range.max_amount
	 * @param maxAmount  the value for loan_amount_range.max_amount
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column loan_amount_range.sequency
	 * @return  the value of loan_amount_range.sequency
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public Integer getSequency() {
		return sequency;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column loan_amount_range.sequency
	 * @param sequency  the value for loan_amount_range.sequency
	 * @mbg.generated  Thu Mar 29 16:22:47 CST 2018
	 */
	public void setSequency(Integer sequency) {
		this.sequency = sequency;
	}
}