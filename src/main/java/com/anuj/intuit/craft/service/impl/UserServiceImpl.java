package com.anuj.intuit.craft.service.impl;

import com.anuj.intuit.craft.dao.IUserDao;
import com.anuj.intuit.craft.dao.UserRepository;
import com.anuj.intuit.craft.dto.User;
import com.anuj.intuit.craft.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userDao;

    @Override
    public User registerUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        return null;
    }
}
