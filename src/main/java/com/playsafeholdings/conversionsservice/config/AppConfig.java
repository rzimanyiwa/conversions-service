package com.playsafeholdings.conversionsservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(PropertyConfig.class)
@Configuration
public class AppConfig {

}
