package com.myproj.dao.impl;

import com.myproj.dao.UserDao;
import com.myproj.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private QueryRunner queryRunner;

    @Override
    public void save(User user) {
        try {
            queryRunner.update("insert into user(name, money) value(?,?)", user.getName(), user.getMoney());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(User user) {
        try {
            queryRunner.update("update user set name=?,money=? where id = ? ", user.getName(),user.getMoney(), user.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(User user) {
        try {
            queryRunner.update("delete from user where id = ?", user.getId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User findById(int id) {
        //将结果集中的第一行数据封装到一个对应的JavaBean实例中
        try {
            return queryRunner.query("select * from user where id = ?", new BeanHandler<User>(User.class), id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        // 将结果集封装到一个javabean数组里;
        try {
            return queryRunner.query("select * from user", new BeanListHandler<User>(User.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}

