package com.pinganzhiyuan.model;

public class Guarantee {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee.id
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee.credit_guarantee
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    private String creditGuarantee;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee.squency
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    private Byte squency;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee.id
     * @return  the value of guarantee.id
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee.id
     * @param id  the value for guarantee.id
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee.credit_guarantee
     * @return  the value of guarantee.credit_guarantee
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public String getCreditGuarantee() {
        return creditGuarantee;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee.credit_guarantee
     * @param creditGuarantee  the value for guarantee.credit_guarantee
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public void setCreditGuarantee(String creditGuarantee) {
        this.creditGuarantee = creditGuarantee;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee.squency
     * @return  the value of guarantee.squency
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public Byte getSquency() {
        return squency;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee.squency
     * @param squency  the value for guarantee.squency
     * @mbg.generated  Mon Jan 22 14:44:51 CST 2018
     */
    public void setSquency(Byte squency) {
        this.squency = squency;
    }
}