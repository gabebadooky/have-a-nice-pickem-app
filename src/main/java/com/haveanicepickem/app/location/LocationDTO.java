package com.haveanicepickem.app.location;


public record LocationDTO(
    String stadium,
    String city,
    String state,
    Float latitude,
    Float longitude
) {}
