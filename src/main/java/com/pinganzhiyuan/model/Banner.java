package com.pinganzhiyuan.model;

public class Banner {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column banner.id
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column banner.credit_ceiling
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    private Integer creditCeiling;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column banner.unit
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    private String unit;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column banner.pass_rate
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    private Double passRate;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column banner.id
     * @return  the value of banner.id
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column banner.id
     * @param id  the value for banner.id
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column banner.credit_ceiling
     * @return  the value of banner.credit_ceiling
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public Integer getCreditCeiling() {
        return creditCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column banner.credit_ceiling
     * @param creditCeiling  the value for banner.credit_ceiling
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public void setCreditCeiling(Integer creditCeiling) {
        this.creditCeiling = creditCeiling;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column banner.unit
     * @return  the value of banner.unit
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column banner.unit
     * @param unit  the value for banner.unit
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column banner.pass_rate
     * @return  the value of banner.pass_rate
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public Double getPassRate() {
        return passRate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column banner.pass_rate
     * @param passRate  the value for banner.pass_rate
     * @mbg.generated  Sat Dec 16 11:03:35 CST 2017
     */
    public void setPassRate(Double passRate) {
        this.passRate = passRate;
    }
}