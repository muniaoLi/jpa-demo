package com.muniao.jpademo;

import com.muniao.jpademo.dao.UserDao;
import com.muniao.jpademo.domain.User;
import com.muniao.jpademo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests
{
    @Autowired
    UserDao userDao;

    @Test
    public void test1()
    {
        User user = userDao.findUserById(4L);
        System.out.println(user);
    }

    @Test
    public void test2()
    {
        User user = userDao.getUserById(4L);
        System.out.println(user);
    }

    @Test
    public void test3()
    {
        User user = new User();
        user.setName("小三");
        user.setAge(20);
        userDao.save(user);
        System.out.println(user);

        List<User> list = userDao.findAll();
        System.out.println(list);
    }

    @Test
    public void testSave()
    {
        User user = new User();
        user.setName("小三");
        user.setAge(20);
        userDao.save(user);
        System.out.println(user);
    }

    @Autowired
    UserService userService;

    @Test
    public void testFlush()
    {
        userService.updateUser(2L);

        User user = userDao.getOne(2L);
        System.out.println(user);
    }




}
