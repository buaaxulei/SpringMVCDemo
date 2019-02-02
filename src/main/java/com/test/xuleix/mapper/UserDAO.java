package com.test.xuleix.mapper;

import com.test.xuleix.Model.User;

import java.util.List;

public interface UserDAO {

    public int add(User user);

    public int update(User user);

    public User findById(long id);

    public List<User> findAll();

    public int delete(long id);
}
