package com.example.demo.dao;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

/**
 * Created by huangpenglong on 2017/9/18.
 */

@Repository
@Table(name="user")
@Qualifier("UserDao")
public interface UserDao extends CrudRepository<User, Long >{

    public User findOne(Long id);

    public User save(User u);

    @Query("select t from User t where t.userName=:name")
    public User findUserByName(@Param("name") String name);

}
