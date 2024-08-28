package com.roleAndpermission.feature.user;
import org.springframework.stereotype.Service;

import com.roleAndpermission.domain.roleAndpermission.User;
import com.roleAndpermission.feature.user.dto.UserResponse;
import com.roleAndpermission.feature.user.dto.UserServices;
import com.roleAndpermission.mapper.user.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServicesImplementation implements UserServices {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserResponse getAllUser(Long id) {
        // User user = userRepository.findById(id).orElse(null);
        User user = userRepository.findFectById(id).orElse(null);
        return userMapper.fromUser(user);
    }
    
}
