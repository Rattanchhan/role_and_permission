package com.roleAndpermission.feature.permission.dto;

public record PermissionResponse (
    Long id,
    String code,
    String name,
    String module
){
    
}
