package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

/**
 * Created by huangpenglong on 2017/9/18.
 */

@Service(value = "UserService")
public class UserService {

        @Autowired
        private UserDao userDao;

        public User getUserById(Long id) {
            User u = userDao.findOne(id);
            System.out.println("userDao: " + userDao);
            System.out.println("id: " + id);
            return u;
        }

        public void saveUser() {
            User u = new User();
            u.setUserName("wan");
            u.setAddress("江西省上饶市鄱阳县");
            u.setBirthDay(new Date());
            u.setSex("男");
            userDao.save(u);
        }
}
