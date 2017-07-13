package com.hhy.springbootlearn.entity;

/**
 * Created by hhy on 17/7/12.
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "s_resource_role")
public class SysResourceRole {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "role_id")
    private Long roleId; //角色ID

    @Column(name = "resource_id")
    private Long resourceId;//资源ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}

