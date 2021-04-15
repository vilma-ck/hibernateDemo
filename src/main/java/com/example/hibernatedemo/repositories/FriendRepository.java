package com.example.hibernatedemo.repositories;

import com.example.hibernatedemo.models.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-15
 * Project: hibernateDemo
 * Copyright: MIT
 */
@Repository
public interface FriendRepository extends CrudRepository<Friend, Long> {

 List<Friend> findByName(String name);
 List<Friend> findByEmail(String email);
 List<Friend> findByPhoneNumber(String phoneNumber);
}
