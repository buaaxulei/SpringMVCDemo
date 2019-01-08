package com.test.xuleix.Service;

import com.test.xuleix.Model.User;
import com.test.xuleix.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tian Wang on 2015/3/30.
 */
@Service("userService")
public class UserService implements IUserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAllUsers() {
        return mapper.findAll();
    }

    @Override
    public User getUser(long userId) {
        return mapper.findById(userId);
    }

    @Override
    public void addUser(User user) {
        mapper.add(user);
    }

    @Override
    public void deleteUser(long userId) {
        mapper.delete(userId);
    }
}
