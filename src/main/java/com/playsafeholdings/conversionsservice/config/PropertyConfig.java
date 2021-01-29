package com.playsafeholdings.conversionsservice.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        ConvertionProperties.class
})
public class PropertyConfig {

}
