package com.example.hibernatedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-04-15
 * Project: hibernateDemo
 * Copyright: MIT
 */
@Entity
public class Friend {

 @Id
 @GeneratedValue
 private long id;

 private String name;
 private String email;
 private String phoneNumber;

 public Friend(){}

 public Friend(long id, String name, String email, String phoneNumber) {
  this.id = id;
  this.name = name;
  this.email = email;
  this.phoneNumber = phoneNumber;
 }

 @Override
 public String toString() {
  return "Friend{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", email='" + email + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          '}';
 }

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }
}
