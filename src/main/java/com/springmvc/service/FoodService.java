package com.springmvc.service;

import com.springmvc.dao.FoodMapper;
import com.springmvc.dao.UserMapper;
import com.springmvc.pojo.Food;
import com.springmvc.pojo.Shop;
import com.springmvc.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("FoodService")

public class FoodService {
    @Resource
    private FoodMapper foodMapper;


    public Food getFood(int id){
        Food a=this.foodMapper.selectByPrimaryKey(id);
        if(a!=null){
            return a;
        }
        return null;
    }

    public int insertFood(Food food){
        return this.foodMapper.insert(food);
    }
}
