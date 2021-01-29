package com.playsafeholdings.conversionsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "conversion")
public class ConvertionProperties {

    private Double kelvinFactor;

    public Double getKelvinFactor() {
        return kelvinFactor;
    }

    public void setKelvinFactor(Double kelvinFactor) {
        this.kelvinFactor = kelvinFactor;
    }
}
