package com.playsafeholdings.conversionsservice.service;

public interface ConversionService {

    ConversionResponse convertKelvinToCelsius(Double inputValue);

    ConversionResponse convertCelciusToKelvin(double inputValue);

    ConversionResponse convertMileToKilometer(double inputValue);

    ConversionResponse convertKilometerToMile(double inputValue);
}
