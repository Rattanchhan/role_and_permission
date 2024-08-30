package com.roleAndpermission.feature.user.dto;
import java.util.*;

public interface UserServices {

    UserResponse getUser(Long id);
    List<UserResponse> getAllUsers();
}
