package com.haveanicepickem.user;

public record UserDTO(
    String username,
    String displayName,
    String favoriteTeam,
    char notificationPreference,
    String emailAddress,
    String phone
) {}
