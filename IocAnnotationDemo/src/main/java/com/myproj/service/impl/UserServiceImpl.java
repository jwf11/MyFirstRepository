package com.myproj.service.impl;

import com.myproj.dao.UserDao;
import com.myproj.dao.impl.UserDaoImpl;
import com.myproj.domain.User;
import com.myproj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    private UserDao UserDao;

    public UserDao getUserDao() {
        return UserDao;
    }

    public void setUserDao(UserDao UserDao) {
        this.UserDao = UserDao;
    }

    @Override
    public void save(User user) {
        UserDao.save(user);
    }

    @Override
    public void update(User user) {
        UserDao.update(user);
    }

    @Override
    public void delete(User user) {
        UserDao.delete(user);
    }

    @Override
    public User findById(int id) {
        return UserDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return UserDao.findAll();
    }
}
