package com.roleAndpermission.feature.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.roleAndpermission.domain.roleAndpermission.User;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT u FROM User AS u JOIN FETCH u.role AS r JOIN FETCH r.rolePermissions AS p JOIN FETCH p.permission WHERE u.id = :id")
    Optional<User> findFectById(@Param("id")Long id);
}
