package com.hhy.springbootlearn.repository;

import com.hhy.springbootlearn.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hhy on 17/7/11.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u where u.userName = :userName")
    public List<User> getByUserName(@Param("userName") String userName);
}
