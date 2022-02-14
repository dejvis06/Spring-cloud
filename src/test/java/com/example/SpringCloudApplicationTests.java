package com.example;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringCloudApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        // userRepository.save(User.builder().username("dejvis06").build());

        User user = userRepository.findByUsername("dejvis07");
        System.err.println(user.toString());

        Optional<User> optionalUser = userRepository.findById("620abc629a0a901c91f6bcd4");
        System.err.println(optionalUser.get().toString());

        user.setUsername("dejvis07");
        userRepository.save(user);

        userRepository.deleteById("620abc629a0a901c91f6bcd4");
    }

}
