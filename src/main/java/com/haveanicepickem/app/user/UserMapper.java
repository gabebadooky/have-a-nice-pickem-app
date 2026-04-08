package com.haveanicepickem.app.user;

public class UserMapper {
    
    public UserDTO toDTO(UserEntity user) {
        String username = user.getUsername();
        String displayName = user.getDisplayName();
        String favoriteTeam = user.getFavoriteTeam();
        char notificationPreference = user.getNotificationPreference();
        String emailAddress = user.getEmailAddress();
        String phone = user.getPhone();

        return new UserDTO(
            username,
            displayName,
            favoriteTeam,
            notificationPreference,
            emailAddress,
            phone
        );
    }

}
