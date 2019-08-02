package com.itdr.service;

import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;

import java.util.List;

public class UserService {
    public List<Users> selectAll(String pageSize, String pageNum) {
        if(pageSize==null){
            pageSize="10";
        }
        if(pageNum==null){
            pageSize="1";
        }
        UserDao ud = new UserDao();
        List<Users> li = ud.SelectAll(pageSize,pageNum);
        return null;
    }
}
