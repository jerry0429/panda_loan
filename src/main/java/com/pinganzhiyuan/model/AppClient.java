package com.pinganzhiyuan.model;

public class AppClient {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_client.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_client.name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_client.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private String packageName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_client.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	private Long channelId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_client.id
	 * @return  the value of app_client.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_client.id
	 * @param id  the value for app_client.id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_client.name
	 * @return  the value of app_client.name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_client.name
	 * @param name  the value for app_client.name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_client.package_name
	 * @return  the value of app_client.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_client.package_name
	 * @param packageName  the value for app_client.package_name
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_client.channel_id
	 * @return  the value of app_client.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_client.channel_id
	 * @param channelId  the value for app_client.channel_id
	 * @mbg.generated  Wed Mar 28 11:14:47 CST 2018
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
}