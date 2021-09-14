package com.health.service;

import com.health.pojo.User;

public interface UserService {
    public User findByUsername(String user_name);
}
