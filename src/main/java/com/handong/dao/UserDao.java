package com.handong.dao;

import com.handong.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    SqlSessionTemplate sqlSession;
    public User getUser(User user) {
        return sqlSession.selectOne("User.getUser", user);
    }
}
