package com.hhy.springbootlearn.entity;

/**
 * Created by hhy on 17/7/12.
 */

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

//角色表
@Entity
@Table(name = "s_role")
public class SysRole {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;//角色名称

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "sys_user_role", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<SysUser> sysUsers;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "s_resource_role", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "resource_id")})
    private Set<SysResource> sysResources;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SysUser> getSysUsers() {
        return sysUsers;
    }

    public void setSysUsers(Set<SysUser> sysUsers) {
        this.sysUsers = sysUsers;
    }

    public Set<SysResource> getSysResources() {
        return sysResources;
    }

    public void setSysResources(Set<SysResource> sysResources) {
        this.sysResources = sysResources;
    }
}

