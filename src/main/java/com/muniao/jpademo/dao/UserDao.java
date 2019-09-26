package com.muniao.jpademo.dao;

import com.muniao.jpademo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long>
{
    User findUserById(Long id);

    User getUserById(Long id);

    List<User> findAll();

}
