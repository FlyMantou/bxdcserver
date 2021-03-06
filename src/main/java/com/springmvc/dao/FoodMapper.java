package com.springmvc.dao;

import com.springmvc.pojo.Food;
import com.springmvc.pojo.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int countByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int deleteByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int insertSelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    List<Food> selectByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    Food selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int updateByPrimaryKeySelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Fri Nov 02 15:19:41 CST 2018
     */
    int updateByPrimaryKey(Food record);
}