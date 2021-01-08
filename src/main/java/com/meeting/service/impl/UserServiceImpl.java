package com.meeting.service.impl;

import com.meeting.mapper.UserMapper;
import com.meeting.model.User;
import com.meeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * impl
 * 是对mapper和service的整合
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public int queryUser(Map<String,Object> map) {
        return userMapper.queryUser(map);
    }
    //注册
    @Override
    public Integer addUser(Map<String, Object> map) {
          return userMapper.addUser(map);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public List<User> search(String chara) {
        return userMapper.search(chara);
    }

    @Override
    public int update(Map<String,Object> map) {
        return userMapper.update(map);
    }

    //查询
    @Override
    public User query(int id) {
        return userMapper.query(id);
    }
    @Override
    public int checkUser(int id,int position_id) {
        return userMapper.checkUser(id,position_id);
    }




//    @Override
//    public List<User> selectUserPage(String userName, String userSex, Integer startRows) {
//        return userMapper.selectUserPage(userName, userSex, startRows);
//    }
//
//    @Override
//    public Integer getRowCount(String userName, String userSex) {
//        return userMapper.getRowCount(userName, userSex);
//    }
//
//    @Override
//    public Integer createUser(User user) {
//        return userMapper.createUser(user);
//    }
//
//    @Override
//    public Integer deleteUserById(String userId) {
//        return userMapper.deleteUserById(userId);
//    }
//
//    @Override
//    public Integer deleteUserByIdList(@Param("list") List userIds) {
//        return userMapper.deleteUserByIdList(userIds);
//    }




}
