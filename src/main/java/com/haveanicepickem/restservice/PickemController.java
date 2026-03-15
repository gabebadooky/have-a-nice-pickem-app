package com.haveanicepickem.restservice;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class PickemController {

    @Operation(summary = "Root/test endpoint for Have a Nice Pickem service")
    @GetMapping("/")
    public Map<String, String> root() {
        return Map.of("message", "welcome!");
    }
}
