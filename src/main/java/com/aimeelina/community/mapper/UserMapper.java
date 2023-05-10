package com.aimeelina.community.mapper;

import com.aimeelina.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    User selectById(int id);
    User selectByName(String name);
    User selectByEmail(String email);
    User selectByPhone(String phone);
    List<User> selectAll(int maxLine);
    int insertUser(User user);
    int updateStatus(int id,int status);
    int updateHeader(int id,String headerUrl);
    int updatePassword(int id,String password);


}
