package com.application.FamilySupporter.service;

import com.application.FamilySupporter.entity.User;
import com.application.FamilySupporter.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
