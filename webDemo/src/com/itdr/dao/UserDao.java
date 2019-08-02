package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.utils.PoolUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    public List<Users> SelectAll(String pageSize, String pageNum) {
        ComboPooledDataSource co = PoolUtil.getCom();
        QueryRunner qr = new QueryRunner(co);
        String sql  = "SELECT * FROM users";
        List<Users> li=null;
        try {
            li = qr.query(sql, new BeanListHandler<Users>(Users.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }
}
