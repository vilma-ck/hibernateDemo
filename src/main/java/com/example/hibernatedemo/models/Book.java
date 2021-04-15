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
public class Book {

 @Id
 @GeneratedValue
 private long id;

 private String author;

 private String title;

 public Book(){}

 public Book(long id, String author, String title) {
  this.id = id;
  this.author = author;
  this.title = title;
 }

 @Override
 public String toString() {
  return "Book{" +
          "id=" + id +
          ", author='" + author + '\'' +
          ", title='" + title + '\'' +
          '}';
 }

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }
}
