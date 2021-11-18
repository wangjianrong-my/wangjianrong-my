package com.jianrong.demo.impl;


import com.jianrong.demo.mybatis.entity.MVCMybatisDemoUser;
import com.jianrong.demo.mybatis.mapper.MVCMybatisDemoUserMapper;
import com.jianrong.demo.GetUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;



/*
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 * @date 2020/10/27
 */

@Service
public class GetUserInfoServiceImpl implements GetUserInfoService{

    @Autowired
    protected MVCMybatisDemoUserMapper mVCMybatisDemoUserMapper;

    public void getUserInfoById(String id, Model model)
    {


        System.out.println("aaag");

        //search by id, get UserInfo
        MVCMybatisDemoUser user = mVCMybatisDemoUserMapper.queryUserInfo(id);
        model.addAttribute("name", user.getId())
                .addAttribute("age", user.getAge())
                .addAttribute("height", user.getHeight())
                .addAttribute("weight", user.getWeight());
    }
}
