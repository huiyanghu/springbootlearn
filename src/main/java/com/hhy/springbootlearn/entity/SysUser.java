package com.hhy.springbootlearn.entity;

/**
 * Created by hhy on 17/7/12.
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "s_user")//code11
public class SysUser implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")

    private Long id;
    @Column(name = "user_name")
    private String username; //用户名

    @Column(name = "password", length = 120)
    private String password;//用户密码


    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "sys_user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<SysRole> sysRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }
}
