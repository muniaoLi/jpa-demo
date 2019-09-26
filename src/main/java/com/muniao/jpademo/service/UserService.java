package com.muniao.jpademo.service;

import com.muniao.jpademo.dao.UserDao;
import com.muniao.jpademo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService
{
    @Autowired
    UserDao userDao;

    public User findUserById(Long id)
    {
        return userDao.findUserById(id);
    }

    public void updateUser(Long id)
    {
        User user = userDao.getOne(id);
        user.setName("新名字");
        userDao.flush();
    }
}
