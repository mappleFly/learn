package com.lms.learn.service;

import com.lms.learn.Entity.UserInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<UserInfo> getUserList();
    UserInfo getUserByName(String name);
    UserInfo addUserInfo(UserInfo userInfo);
    UserInfo updateUserInfoById(UserInfo userInfo);
    void deleteUserInfoById(long Id);
    List<UserInfo> getCurrentUserList();
    Page<UserInfo> getPageUserList();
}
