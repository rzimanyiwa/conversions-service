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

    @Override
    public ConversionResponse convertCelciusToKelvin(double celcius) {
        Double convertedValue = celcius - Double.parseDouble(environment.getRequiredProperty("conversion.celcius.factor"));
        return new ConversionResponse(convertedValue);
    }

    @Override
    public ConversionResponse convertMileToKilometer(double mile) {
        Double convertedValue = mile - Double.parseDouble(environment.getRequiredProperty("conversion.mile.factor"));
        return new ConversionResponse(convertedValue);
    }

    @Override
    public ConversionResponse convertKilometerToMile(double kilometre) {
        Double convertedValue = kilometre - Double.parseDouble(environment.getRequiredProperty("conversion.kilometer.factor"));
        return new ConversionResponse(convertedValue);
    }
}
