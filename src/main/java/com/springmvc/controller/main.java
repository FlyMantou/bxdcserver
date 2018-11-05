package com.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.springmvc.entity.Data;
import com.springmvc.entity.DataListBody;
import com.springmvc.pojo.Food;
import com.springmvc.pojo.Shop;
import com.springmvc.pojo.User;
import com.springmvc.service.FoodService;
import com.springmvc.service.ShopService;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class main {


    @Resource
    ShopService shopService;
    @Resource
    FoodService foodService;

    //跳转到index.jsp页面
    @RequestMapping("/")
    public String index(){
        return "index";
    }



    @RequestMapping(value = "/shoplist",method = RequestMethod.GET)
    @ResponseBody
    public List<Shop> readShopList(){
        return shopService.getAllShop();
    }

    @RequestMapping(value = "/getfoods",method = RequestMethod.GET)
    @ResponseBody
    public List<Food> getFoods(int shopid){
        return foodService.getFoodsByShopid(shopid);
    }

    @RequestMapping(value = "/addfood",method = RequestMethod.GET)
    @ResponseBody
    public String addShop(Food food){
        foodService.insertFood(food);
        List<Data> dataList =  new ArrayList<Data>();
        dataList.addAll(foodService.getFoodsByShopid(food.getShopid()));
        DataListBody dataListBody = new DataListBody();
        dataListBody.setStatus(200);
        dataListBody.setMsg("请求成功");
        dataListBody.setDataList(dataList);
        return JSON.toJSONString(dataListBody);
    }

    @RequestMapping(value = "/addshop",method = RequestMethod.GET)
    @ResponseBody
    public String addShop(Shop shop){
        shopService.insertShop(shop);
        List<Data> dataList =  new ArrayList<Data>();
        dataList.addAll(shopService.getAllShop());
        DataListBody dataListBody = new DataListBody();
        dataListBody.setStatus(200);
        dataListBody.setMsg("请求成功");
        dataListBody.setDataList(dataList);
        return JSON.toJSONString(dataListBody);
    }
}
