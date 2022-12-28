package com.demo.manager.controller;

import com.demo.manager.dao.*;
import com.demo.manager.dao.Character;
import com.demo.manager.dto.CommonResult;
import com.demo.manager.mapper.AdminMapper;
import com.demo.manager.mymapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName AdminController.java
 * @Description TODO
 * @createTime 2022年06月02日 16:39:00
 */
@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    CatMapper catMapper;
    @Autowired
    CharacterMapper characterMapper;
    @Autowired
    PosMapper posMapper;
    @Autowired
    ColorMapper colorMapper;
    @Autowired
    FeedMapper feedMapper;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    LocationMapper locationMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public CommonResult login(@RequestBody User user){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> trueuser=userMapper.selectByExample(userExample);
        if(trueuser.size()==1&&trueuser.get(0).getPassword().equals(user.getPassword())){
            CommonResult commonResult=new CommonResult();
            commonResult.data("登录成功");
            return commonResult.success();
        }else{
            CommonResult commonResult=new CommonResult();
            commonResult.data("登录失败");
            return commonResult.fail();
        }
    }
    @PostMapping("/register")
    public CommonResult register(@RequestBody User user){
        CommonResult commonResult=new CommonResult();
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> trueuser=userMapper.selectByExample(userExample);
        if(trueuser.size()==0){
            if(userMapper.insert(user)==1){
                commonResult.data("注册成功");
                return commonResult;
            }
        }
        commonResult.data("注册失败");
        return commonResult;
    }
    @GetMapping("/listallcat")
    public CommonResult listallcat(){
        CommonResult commonResult=new CommonResult();
        CatExample catExample=new CatExample();
        List<Cat> cats=catMapper.selectByExample(catExample);
        commonResult.data(cats);
        return commonResult.success();
    }
    @GetMapping("/listallcolor")
    public CommonResult listallcolor(){
        CommonResult commonResult=new CommonResult();
        ColorExample ColorExample=new ColorExample();
        List<Color> Colors=colorMapper.selectByExample(ColorExample);
        commonResult.data(Colors);
        return commonResult.success();
    }
    @GetMapping("/listallcharacter")
    public CommonResult listallcharacter(){
        CommonResult commonResult=new CommonResult();
        CharacterExample characterExample=new CharacterExample();
        List<Character> characters=characterMapper.selectByExample(characterExample);
        commonResult.data(characters);
        return commonResult.success();
    }
    @GetMapping("/listallfeed")
    public CommonResult listallfeed(){
        CommonResult commonResult=new CommonResult();
        FeedExample feedExample=new FeedExample();
        List<Feed> feeds=feedMapper.selectByExample(feedExample);
        commonResult.data(feeds);
        return commonResult.success();
    }
    @GetMapping("/listalllocation")
    public CommonResult listalllocation(){
        CommonResult commonResult=new CommonResult();
        LocationExample locationExample=new LocationExample();
        List<Location> locations=locationMapper.selectByExample(locationExample);
        commonResult.data(locations);
        return commonResult.success();
    }
    @GetMapping("/listalluser")
    public CommonResult listalluser(){
        CommonResult commonResult=new CommonResult();
        UserExample userExample=new UserExample();
        List<User> users=userMapper.selectByExample(userExample);
        commonResult.data(users);
        return commonResult.success();
    }
    @PostMapping("/addnewcat")
    public CommonResult addnewcat(@RequestBody Cat cat){
        CommonResult commonResult=new CommonResult();
        if(catMapper.insert(cat)==1){
            return commonResult.success();
        }
        return commonResult.fail();
    }
    @PostMapping("/poscheck")
    public CommonResult poscheck(@RequestBody Pos check){
        CommonResult commonResult=new CommonResult();
        if(posMapper.insert(check)==1){
            return commonResult.success();
        }
        return commonResult.fail();
    }
    @PostMapping("/addfeedinfo")
    public CommonResult addfeedinfo(@RequestBody Feed feed){
        CommonResult commonResult=new CommonResult();
        if(feedMapper.insert(feed)==1){
            return commonResult.success();
        }
        return commonResult.fail();
    }
}
