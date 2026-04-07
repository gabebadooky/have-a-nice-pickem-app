package com.haveanicepickem.location;


public record LocationDTO(
    String stadium,
    String city,
    String state,
    Float latitude,
    Float longitude
) {}
