package com.hnlx.gatewayserver.config;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorGive implements StpInterface {

    @Override
    public List<String> getPermissionList(Object o, String s) {
        return null;
    }

    @Override
    public List<String> getRoleList(Object o, String s) {
        //o属性就是刚刚绑定的id，通过这个id去数据库查询权限
        Integer id= Integer.parseInt((String) o);
        String role = "user";
        List<String> list = new ArrayList<String>();
        if(id > 1000000000){
            role = "admin";
        }
        //“*”权限表示什么都可以访问
        list.add(role);
        return list;
    }
}
