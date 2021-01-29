package com.playsafeholdings.conversionsservice.service;

public class ConversionResponse {

    private Double output;

    public ConversionResponse(Double convertedValue) {
        this.output = convertedValue;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }
}
