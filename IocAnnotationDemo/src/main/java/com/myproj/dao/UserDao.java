package com.myproj.dao;

import com.myproj.domain.User;

import java.util.List;

public interface UserDao {
    public void save(User user);
    public void update(User user);
    public void delete(User user);
    public User findById(int id);
    public List<User> findAll();

}
