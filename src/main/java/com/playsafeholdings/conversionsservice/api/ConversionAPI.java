package com.playsafeholdings.conversionsservice.api;

import com.playsafeholdings.conversionsservice.service.ConversionResponse;
import com.playsafeholdings.conversionsservice.service.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/conversions")
public class ConversionAPI {

    private final ConversionService conversionService;

    public ConversionAPI(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @PostMapping(value = "/ktoc", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity convertKelvinToCelsius(@RequestBody InputRequestDto inputRequestDto){
        ConversionResponse conversionResponse = conversionService.convertKelvinToCelsius(inputRequestDto.getInputValue());
        return ResponseEntity.status(HttpStatus.OK).body(conversionResponse);
    }

    @PostMapping(value = "/ctok", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity convertCelciusToKelvin(@RequestBody InputRequestDto inputRequestDto){
        ConversionResponse conversionResponse = conversionService.convertCelciusToKelvin(inputRequestDto.getInputValue());
        return ResponseEntity.status(HttpStatus.OK).body(conversionResponse);
    }

    @PostMapping(value = "/mtok", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity convertMileToKilometer(@RequestBody InputRequestDto inputRequestDto){
        ConversionResponse conversionResponse = conversionService.convertMileToKilometer(inputRequestDto.getInputValue());
        return ResponseEntity.status(HttpStatus.OK).body(conversionResponse);
    }

    @PostMapping(value = "/ktom", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity convertKilometerToMile(@RequestBody InputRequestDto inputRequestDto){
        ConversionResponse conversionResponse = conversionService.convertKilometerToMile(inputRequestDto.getInputValue());
        return ResponseEntity.status(HttpStatus.OK).body(conversionResponse);
    }
}
