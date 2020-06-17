package com.sda.springboot.angulardemo;

import com.sda.springboot.angulardemo.model.User;
import com.sda.springboot.angulardemo.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class AngularDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngularDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepo userRepository){
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").
                forEach(input ->{
                    User user = new User(input, input + "gmail.com");
                    userRepository.save(user);
                });
        };

    }
}
