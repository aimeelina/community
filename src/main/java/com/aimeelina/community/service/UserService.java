package com.aimeelina.community.service;

import com.aimeelina.community.entity.User;
import com.aimeelina.community.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser(int maxLine){
        return userMapper.selectAll(maxLine);
    }



}
