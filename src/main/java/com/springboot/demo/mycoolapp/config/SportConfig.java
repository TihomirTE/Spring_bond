package com.springboot.demo.mycoolapp.config;

import com.springboot.demo.mycoolapp.common.Coach;
import com.springboot.demo.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    // @Bean use case is take existing third-party class and expose as a Spring bean
    // Also Custom Bean ID can be used
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
