package com.px.mapper;

import com.px.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User select(@Param("userName") String userName, @Param("userPasswd") String userPasswd);
}
