package com.pinganzhiyuan.model;

public class Captcha {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column captcha.id
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column captcha.cookie
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    private String cookie;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column captcha.captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    private String captcha;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column captcha.expired
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    private Integer expired;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column captcha.is_passed
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    private Byte isPassed;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column captcha.id
     * @return  the value of captcha.id
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column captcha.id
     * @param id  the value for captcha.id
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column captcha.cookie
     * @return  the value of captcha.cookie
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column captcha.cookie
     * @param cookie  the value for captcha.cookie
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column captcha.captcha
     * @return  the value of captcha.captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public String getCaptcha() {
        return captcha;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column captcha.captcha
     * @param captcha  the value for captcha.captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column captcha.expired
     * @return  the value of captcha.expired
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public Integer getExpired() {
        return expired;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column captcha.expired
     * @param expired  the value for captcha.expired
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column captcha.is_passed
     * @return  the value of captcha.is_passed
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public Byte getIsPassed() {
        return isPassed;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column captcha.is_passed
     * @param isPassed  the value for captcha.is_passed
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    public void setIsPassed(Byte isPassed) {
        this.isPassed = isPassed;
    }
}