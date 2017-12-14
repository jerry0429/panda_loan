package com.pinganzhiyuan.model;

import java.util.Date;

public class Product {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String title;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.subtitle
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String subtitle;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.is_published
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Boolean isPublished;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.img_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String imgUrl;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String url;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.weight
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer weight;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.light_title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String lightTitle;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.edu
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String edu;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.loan_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer loanFloor;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.loan_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer loanCeiling;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.duration_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer durationFloor;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.duration_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer durationCeiling;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.interest_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Double interestFloor;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.interest_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Double interestCeiling;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.credit_auth
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String creditAuth;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.lender_name
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String lenderName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.lender_desc
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String lenderDesc;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.active_captcha_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String activeCaptchaUrl;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.reg_interface_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private String regInterfaceUrl;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.publish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Date publishTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.unpublish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Date unpublishTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.display_type
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Byte displayType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.charge_mode_id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Long chargeModeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.apply_times
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer applyTimes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product.loan_wait_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    private Integer loanWaitTime;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.id
     * @return  the value of product.id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.id
     * @param id  the value for product.id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.title
     * @return  the value of product.title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.title
     * @param title  the value for product.title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.subtitle
     * @return  the value of product.subtitle
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.subtitle
     * @param subtitle  the value for product.subtitle
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.is_published
     * @return  the value of product.is_published
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Boolean getIsPublished() {
        return isPublished;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.is_published
     * @param isPublished  the value for product.is_published
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.img_url
     * @return  the value of product.img_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.img_url
     * @param imgUrl  the value for product.img_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.url
     * @return  the value of product.url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.url
     * @param url  the value for product.url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.weight
     * @return  the value of product.weight
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.weight
     * @param weight  the value for product.weight
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.light_title
     * @return  the value of product.light_title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getLightTitle() {
        return lightTitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.light_title
     * @param lightTitle  the value for product.light_title
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLightTitle(String lightTitle) {
        this.lightTitle = lightTitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.edu
     * @return  the value of product.edu
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getEdu() {
        return edu;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.edu
     * @param edu  the value for product.edu
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setEdu(String edu) {
        this.edu = edu;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.loan_floor
     * @return  the value of product.loan_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getLoanFloor() {
        return loanFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.loan_floor
     * @param loanFloor  the value for product.loan_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLoanFloor(Integer loanFloor) {
        this.loanFloor = loanFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.loan_ceiling
     * @return  the value of product.loan_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getLoanCeiling() {
        return loanCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.loan_ceiling
     * @param loanCeiling  the value for product.loan_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLoanCeiling(Integer loanCeiling) {
        this.loanCeiling = loanCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.duration_floor
     * @return  the value of product.duration_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getDurationFloor() {
        return durationFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.duration_floor
     * @param durationFloor  the value for product.duration_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setDurationFloor(Integer durationFloor) {
        this.durationFloor = durationFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.duration_ceiling
     * @return  the value of product.duration_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getDurationCeiling() {
        return durationCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.duration_ceiling
     * @param durationCeiling  the value for product.duration_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setDurationCeiling(Integer durationCeiling) {
        this.durationCeiling = durationCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.interest_floor
     * @return  the value of product.interest_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Double getInterestFloor() {
        return interestFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.interest_floor
     * @param interestFloor  the value for product.interest_floor
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setInterestFloor(Double interestFloor) {
        this.interestFloor = interestFloor;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.interest_ceiling
     * @return  the value of product.interest_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Double getInterestCeiling() {
        return interestCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.interest_ceiling
     * @param interestCeiling  the value for product.interest_ceiling
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setInterestCeiling(Double interestCeiling) {
        this.interestCeiling = interestCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.credit_auth
     * @return  the value of product.credit_auth
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getCreditAuth() {
        return creditAuth;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.credit_auth
     * @param creditAuth  the value for product.credit_auth
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setCreditAuth(String creditAuth) {
        this.creditAuth = creditAuth;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.lender_name
     * @return  the value of product.lender_name
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getLenderName() {
        return lenderName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.lender_name
     * @param lenderName  the value for product.lender_name
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.lender_desc
     * @return  the value of product.lender_desc
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getLenderDesc() {
        return lenderDesc;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.lender_desc
     * @param lenderDesc  the value for product.lender_desc
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLenderDesc(String lenderDesc) {
        this.lenderDesc = lenderDesc;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.active_captcha_url
     * @return  the value of product.active_captcha_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getActiveCaptchaUrl() {
        return activeCaptchaUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.active_captcha_url
     * @param activeCaptchaUrl  the value for product.active_captcha_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setActiveCaptchaUrl(String activeCaptchaUrl) {
        this.activeCaptchaUrl = activeCaptchaUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.reg_interface_url
     * @return  the value of product.reg_interface_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public String getRegInterfaceUrl() {
        return regInterfaceUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.reg_interface_url
     * @param regInterfaceUrl  the value for product.reg_interface_url
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setRegInterfaceUrl(String regInterfaceUrl) {
        this.regInterfaceUrl = regInterfaceUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.publish_time
     * @return  the value of product.publish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.publish_time
     * @param publishTime  the value for product.publish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.unpublish_time
     * @return  the value of product.unpublish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Date getUnpublishTime() {
        return unpublishTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.unpublish_time
     * @param unpublishTime  the value for product.unpublish_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setUnpublishTime(Date unpublishTime) {
        this.unpublishTime = unpublishTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.display_type
     * @return  the value of product.display_type
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Byte getDisplayType() {
        return displayType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.display_type
     * @param displayType  the value for product.display_type
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setDisplayType(Byte displayType) {
        this.displayType = displayType;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.charge_mode_id
     * @return  the value of product.charge_mode_id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Long getChargeModeId() {
        return chargeModeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.charge_mode_id
     * @param chargeModeId  the value for product.charge_mode_id
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setChargeModeId(Long chargeModeId) {
        this.chargeModeId = chargeModeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.apply_times
     * @return  the value of product.apply_times
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getApplyTimes() {
        return applyTimes;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.apply_times
     * @param applyTimes  the value for product.apply_times
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setApplyTimes(Integer applyTimes) {
        this.applyTimes = applyTimes;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product.loan_wait_time
     * @return  the value of product.loan_wait_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public Integer getLoanWaitTime() {
        return loanWaitTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product.loan_wait_time
     * @param loanWaitTime  the value for product.loan_wait_time
     * @mbg.generated  Thu Dec 14 19:57:45 CST 2017
     */
    public void setLoanWaitTime(Integer loanWaitTime) {
        this.loanWaitTime = loanWaitTime;
    }
}