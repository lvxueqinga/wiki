package com.lvxueqing.wiki.service;

import com.lvxueqing.wiki.dao.UserMapper;
import com.lvxueqing.wiki.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//写业务逻辑的地方
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> list(){
        return userMapper.selectByExample(null);
    }
}
