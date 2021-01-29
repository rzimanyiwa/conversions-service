package com.playsafeholdings.conversionsservice.config;

import com.playsafeholdings.conversionsservice.service.ConversionService;
import com.playsafeholdings.conversionsservice.service.ConversionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ConversionService conversionService(ConvertionProperties convertionProperties){
        return new ConversionServiceImpl(convertionProperties);
    }
}
