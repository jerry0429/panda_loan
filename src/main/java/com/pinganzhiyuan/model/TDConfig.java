package com.pinganzhiyuan.model;

public class TDConfig {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column td_config.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column td_config.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private String packageName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column td_config.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private Long channelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column td_config.threshold
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private Integer threshold;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column td_config.id
	 * @return  the value of td_config.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column td_config.id
	 * @param id  the value for td_config.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column td_config.package_name
	 * @return  the value of td_config.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column td_config.package_name
	 * @param packageName  the value for td_config.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column td_config.channel_id
	 * @return  the value of td_config.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column td_config.channel_id
	 * @param channelId  the value for td_config.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column td_config.threshold
	 * @return  the value of td_config.threshold
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public Integer getThreshold() {
		return threshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column td_config.threshold
	 * @param threshold  the value for td_config.threshold
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}
}