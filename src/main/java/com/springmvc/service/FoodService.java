package com.springmvc.service;

import com.springmvc.dao.FoodMapper;
import com.springmvc.dao.UserMapper;
import com.springmvc.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public List<Food> getFoodsByShopid(int id){
        FoodExample foodExample = new FoodExample();
        foodExample.createCriteria().andShopidEqualTo(id);
        List<Food> a=this.foodMapper.selectByExample(foodExample);
        if(a!=null){
            return a;
        }
        return null;
    }

    public int insertFood(Food food){
        return this.foodMapper.insert(food);
    }
}
