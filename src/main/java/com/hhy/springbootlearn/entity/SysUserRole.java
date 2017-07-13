package com.hhy.springbootlearn.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hhy on 17/7/12.
 */
@Entity
@Table(name = "sys_user_role")
public class SysUserRole {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "role_id")
    private Long roleId; //角色ID

    @Column(name = "user_id")
    private Long userId;//用户ID

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
