package com.roleAndpermission.feature.user;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roleAndpermission.feature.user.dto.UserResponse;
import com.roleAndpermission.feature.user.dto.UserServices;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServices userServices;
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable("id") String id){
        return userServices.getUser(Long.parseLong(id));
    }

    @GetMapping
    public List<UserResponse> getAllUs(){
        return userServices.getAllUsers();
    }
}
