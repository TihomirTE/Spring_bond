package com.springboot.demo.mycoolapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails ivan = User.builder()
                .username("ivan")
                .password("{noop}123qwe")
                .roles("EMPLOYEE")
                .build();

        UserDetails georgi = User.builder()
                .username("georgi")
                .password("{noop}456asd")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ivan, georgi);

        // - Can be add DB user support later
        // - Restrict URL based on Roles
        // - password BCrypt
    }
}
