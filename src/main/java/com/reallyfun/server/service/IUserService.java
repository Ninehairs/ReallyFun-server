package com.reallyfun.server.service;


import com.reallyfun.server.entity.User;

public interface IUserService {
    void register(String name, String password, String email);

    User login(String name, String password);


}
