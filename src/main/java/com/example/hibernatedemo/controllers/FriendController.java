package com.example.hibernatedemo.controllers;

import com.example.hibernatedemo.models.Friend;
import com.example.hibernatedemo.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-15
 * Project: hibernateDemo
 * Copyright: MIT
 */
@RestController
@RequestMapping("/friend")
public class FriendController {

 @Autowired
 private FriendRepository friendRepository;


 @GetMapping(path="/add")
 public @ResponseBody String addNewFriend(@RequestParam String name, @RequestParam String email, @RequestParam String phoneNumber){
  Friend f = new Friend();
  f.setEmail(email);
  f.setName(name);
  f.setPhoneNumber(phoneNumber);
  friendRepository.save(f);
  return "Friend was added.";
 }

 @GetMapping(path = "/all")
 public Iterable<Friend> allFriends(){
  return friendRepository.findAll();
 }

 @GetMapping(path="/count")
 public @ResponseBody String countFriends(){
  return "Du har " + friendRepository.count() + " vänner.";
 }

 @GetMapping(path="/remove")
 public @ResponseBody String removeFriend(@RequestParam Long id){
  friendRepository.deleteById(id);
  return "Friend was removed.";
 }

 @GetMapping(path="/name")
 public List<Friend> findByName(@RequestParam String name){
  return friendRepository.findByName(name);
 }

 @GetMapping(path="/phoneNumber")
 public List<Friend> findByPhoneNumber(@RequestParam String phoneNumber){
  return friendRepository.findByPhoneNumber(phoneNumber);
 }

 @GetMapping(path="/email")
 public List<Friend> findByEmail(@RequestParam String email){
  return friendRepository.findByEmail(email);
 }





}
