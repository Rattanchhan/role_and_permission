package com.roleAndpermission.mapper.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.roleAndpermission.domain.roleAndpermission.Role_Permission;
import com.roleAndpermission.domain.roleAndpermission.User;
import com.roleAndpermission.feature.permission.dto.PermissionResponse;
import com.roleAndpermission.feature.user.dto.UserResponse;

@Mapper(componentModel = "spring")
public interface UserMapper{

    UserResponse fromUser(User user);
    
    @Mapping(target = "name",source = "permission.name")
    @Mapping(target = "code",source = "permission.code")
    @Mapping(target = "module",source = "permission.module")
    PermissionResponse fromPermissionResponse(Role_Permission role_Permission);
    
}
