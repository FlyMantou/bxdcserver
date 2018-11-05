package com.springmvc.pojo;

import com.springmvc.entity.Data;

public class Shop extends Data {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.id
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.name
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.address
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.img
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.phone
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop.des
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    private String des;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.id
     *
     * @return the value of shop.id
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.id
     *
     * @param id the value for shop.id
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.name
     *
     * @return the value of shop.name
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.name
     *
     * @param name the value for shop.name
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.address
     *
     * @return the value of shop.address
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.address
     *
     * @param address the value for shop.address
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.img
     *
     * @return the value of shop.img
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.img
     *
     * @param img the value for shop.img
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.phone
     *
     * @return the value of shop.phone
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.phone
     *
     * @param phone the value for shop.phone
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop.des
     *
     * @return the value of shop.des
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop.des
     *
     * @param des the value for shop.des
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}