package com.roleAndpermission.domain.baseEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Column
    @Basic(optional=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column
    @Basic(optional=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}

