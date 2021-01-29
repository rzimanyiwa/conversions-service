package com.playsafeholdings.conversionsservice.service;

import com.playsafeholdings.conversionsservice.config.ConvertionProperties;

public class ConversionServiceImpl implements ConversionService {

    private ConvertionProperties convertionProperties;

    public ConversionServiceImpl(ConvertionProperties convertionProperties) {
        this.convertionProperties = convertionProperties;
    }

    @Override
    public Double convertKelvinToCelsius(Double kelvin) {
        return kelvin - convertionProperties.getKelvinFactor();
    }
}
