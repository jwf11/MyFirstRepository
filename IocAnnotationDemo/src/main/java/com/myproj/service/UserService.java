package com.myproj.service;

import com.myproj.domain.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    public void update(User user);
    public void delete(User user);
    public User findById(int id);
    public List<User> findAll();

}
