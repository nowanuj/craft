package com.anuj.intuit.craft.dao.impl;

import com.anuj.intuit.craft.dao.IUserDao;
import com.anuj.intuit.craft.dao.UserRepository;
import com.anuj.intuit.craft.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
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
