package com.example.demo.dao;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void selectUserAll() {
        List<User> users = userDao.selectUserAll();
        System.out.println(users);
    }
    @Test
    public void addUser() {
        User user = new User();
        user.setName("哈哈");
        userDao.addUser(user);
    }
}