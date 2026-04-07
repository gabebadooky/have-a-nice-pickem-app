package com.haveanicepickem.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                                .stream()
                                .map(userMapper::toDTO)
                                .toList();
    }

    public UserDTO getUserByID(Long userID) {
        return userRepository.findById(userID)
                                .map(userMapper::toDTO)
                                .orElse(null);                            
    }

    public UserDTO getUserByDisplay(String displayName) {
        return userRepository.findByDisplayName(displayName)
                                .map(userMapper::toDTO)
                                .orElse(null);                            
    }

}
