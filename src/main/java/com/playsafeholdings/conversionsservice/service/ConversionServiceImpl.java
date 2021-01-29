package com.playsafeholdings.conversionsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConversionServiceImpl implements ConversionService {

    private Environment environment;

    @Autowired
    public ConversionServiceImpl(Environment environment) {
        this.environment = environment;
    }

    @Override
    public ConversionResponse convertKelvinToCelsius(Double kelvin) {
        Double convertedValue = kelvin - Double.parseDouble(environment.getRequiredProperty("conversion.kelvin.factor"));
        return new ConversionResponse(convertedValue);
    }
}
