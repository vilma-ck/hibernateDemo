package com.example.hibernatedemo;

import com.example.hibernatedemo.models.Friend;
import com.example.hibernatedemo.repositories.FriendRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner addData (FriendRepository repository){
        return (args) -> {
            repository.save(new Friend("A", "a@email.se", "0701"));
            repository.save(new Friend("C", "c@email.se", "0707"));

            for(Friend f : repository.findAll()){
                System.out.println(f.toString());
            }
        };
    }
}
