package com.springmvc.service;

import com.springmvc.dao.ShopMapper;
import com.springmvc.dao.UserMapper;
import com.springmvc.pojo.Shop;
import com.springmvc.pojo.ShopExample;
import com.springmvc.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ShopService")

public class ShopService {
    @Resource
    private ShopMapper shopMapper;


    public Shop getShop(int id){
        Shop a=this.shopMapper.selectByPrimaryKey(id);
        if(a!=null){
            return a;
        }
        return null;
    }
    public List<Shop> getAllShop(){
        List<Shop> a=this.shopMapper.selectByExample(new ShopExample());
        if(a!=null){
            return a;
        }
        return null;
    }

    public int insertShop(Shop shop){
        return this.shopMapper.insert(shop);
    }
}
