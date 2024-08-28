package com.roleAndpermission.feature.user.dto;
import java.sql.Date;

import com.roleAndpermission.feature.role.dto.RoleResponse;

import lombok.Builder;

@Builder
public record UserResponse(
    Long id,
    String firstName,
    String lastName,
    Date dob,
    String phone,
    String email,
    RoleResponse role
) {
    
}
