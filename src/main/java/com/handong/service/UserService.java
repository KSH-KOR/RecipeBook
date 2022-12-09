package com.handong.service;

import com.handong.dao.UserDao;
import com.handong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDAO;
    public User getUser(User user) {
        return userDAO.getUser(user);
    }
}
