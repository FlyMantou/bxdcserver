package com.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.springmvc.entity.Data;
import com.springmvc.entity.DataListBody;
import com.springmvc.pojo.Shop;
import com.springmvc.pojo.User;
import com.springmvc.service.ShopService;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class main {


    @Resource
    ShopService shopService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }



    @RequestMapping(value = "/shoplist",method = RequestMethod.GET)
    @ResponseBody
    public List<Shop> readShopList(){
        return shopService.getAllShop();
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
