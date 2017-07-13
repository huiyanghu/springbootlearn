package com.hhy.springbootlearn.security;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hhy.springbootlearn.entity.SysRole;
import com.hhy.springbootlearn.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class SecurityUser extends SysUser implements UserDetails {
    private static final long serialVersionUID = 1L;
    public SecurityUser(SysUser suser) {
        if(suser != null)
        {
            this.setId(suser.getId());
            this.setUsername(suser.getUsername());
            this.setPassword(suser.getPassword());
            this.setSysRoles(suser.getSysRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        Set<SysRole> userRoles = this.getSysRoles();

        if(userRoles != null)
        {
            for (SysRole role : userRoles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
