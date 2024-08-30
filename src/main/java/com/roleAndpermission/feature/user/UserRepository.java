package com.roleAndpermission.feature.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.roleAndpermission.domain.roleAndpermission.User;
import java.util.*;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT u FROM User AS u JOIN FETCH u.role AS r JOIN FETCH r.rolePermissions AS p JOIN FETCH p.permission WHERE u.id = :id")
    Optional<User> findFectById(@Param("id")Long id);

    @Query("SELECT DISTINCT u FROM User u JOIN FETCH u.role r JOIN FETCH r.rolePermissions rp JOIN FETCH rp.permission")
    // @Query(value = "SELECT DISTINCT u.* FROM users u INNER JOIN (roles r INNER JOIN (role_permissions rp INNER JOIN permissions p on rp.permission_id = p.id) on r.id=rp.role_id) on u.role_id = r.id ",nativeQuery = true)
    List<User> findAllUsersWithRolesAndPermissionsDistinct();
}
