package com.test.xuleix.Service;


import com.test.xuleix.Model.User;

import java.util.List;

/**
 * Created by Tian Wang on 2015/3/30.
 */
public interface IUserService {
    public List<User> getAllUsers();

    public User getUser(long userId);

    public void addUser(User user);

    public void deleteUser(long userId);

    public void updateUser(User user);
}

