package com.pinganzhiyuan.model;

public class ProductType {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product_type.id
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product_type.name
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column product_type.sequency
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    private Byte sequency;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product_type.id
     * @return  the value of product_type.id
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product_type.id
     * @param id  the value for product_type.id
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product_type.name
     * @return  the value of product_type.name
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product_type.name
     * @param name  the value for product_type.name
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column product_type.sequency
     * @return  the value of product_type.sequency
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public Byte getSequency() {
        return sequency;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column product_type.sequency
     * @param sequency  the value for product_type.sequency
     * @mbg.generated  Thu Dec 28 14:39:41 CST 2017
     */
    public void setSequency(Byte sequency) {
        this.sequency = sequency;
    }
}