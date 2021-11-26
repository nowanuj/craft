package com.anuj.intuit.craft.dao;

import com.anuj.intuit.craft.dto.User;

public interface IUserDao {

    User registerUser(User user);

    User updateUser(User user);

    String deleteUser(int userId);
}
