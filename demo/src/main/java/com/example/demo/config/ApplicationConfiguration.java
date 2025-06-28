package com.example.demo.config;

import com.example.demo.repository.UserRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    private final UserRepository userRepository;

    public ApplicationConfiguration(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
