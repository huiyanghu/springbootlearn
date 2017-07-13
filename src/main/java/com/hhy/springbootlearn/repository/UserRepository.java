package com.hhy.springbootlearn.repository;

import com.hhy.springbootlearn.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by hhy on 17/7/11.
 */
@Repository
public interface UserRepository extends JpaRepository<SysUser, Long> {

    @Query(value =" from SysUser u where u.username= :userName ")
    public SysUser findByUserName(@Param("userName") String userName);
}
