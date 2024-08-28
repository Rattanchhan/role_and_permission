package com.roleAndpermission.feature.role.dto;
import java.util.List;
import com.roleAndpermission.feature.permission.dto.PermissionResponse;

public record RoleResponse(
    Long id,
    String code,
    String name,
    List<PermissionResponse> rolePermissions
) {
    
}
