package com.mazhiwei.mybatis.pojo;

public class Brand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.id
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.brand_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private String brandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.company_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private String companyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.ordered
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private Integer ordered;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public Brand() {
    }

    public Brand(Integer id, String brandName, String companyName, Integer ordered, String description, Integer status) {
        this.id = id;
        this.brandName = brandName;
        this.companyName = companyName;
        this.ordered = ordered;
        this.description = description;
        this.status = status;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.description
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.status
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.id
     *
     * @return the value of tb_brand.id
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.id
     *
     * @param id the value for tb_brand.id
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.brand_name
     *
     * @return the value of tb_brand.brand_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.brand_name
     *
     * @param brandName the value for tb_brand.brand_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.company_name
     *
     * @return the value of tb_brand.company_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.company_name
     *
     * @param companyName the value for tb_brand.company_name
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.ordered
     *
     * @return the value of tb_brand.ordered
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public Integer getOrdered() {
        return ordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.ordered
     *
     * @param ordered the value for tb_brand.ordered
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.description
     *
     * @return the value of tb_brand.description
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.description
     *
     * @param description the value for tb_brand.description
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.status
     *
     * @return the value of tb_brand.status
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.status
     *
     * @param status the value for tb_brand.status
     *
     * @mbggenerated Mon Mar 13 14:54:17 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}