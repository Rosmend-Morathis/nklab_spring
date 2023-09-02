package com.example.nklab.repository;

import com.example.nklab.pojo.User;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // 查询用户
//    User findUserById();

//    User findUserByUsername();

    @Query("SELECT u FROM User u  WHERE u.email = :email")
    User findUserByEmail(@Param("email") String email);

    @Query("SELECT u FROM User u  WHERE u.email = :email AND u.password = :password")
    User findUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Query("SELECT u FROM User u  WHERE u.password = :password")
    User findUserByPassword(@Param("password") String password);
}
