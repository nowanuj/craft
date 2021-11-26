package com.anuj.intuit.craft.service;

import com.anuj.intuit.craft.dto.User;

public interface IUserService {

    User registerUser(User user);

    User updateUser(User user);

    String deleteUser(int userId);
}
