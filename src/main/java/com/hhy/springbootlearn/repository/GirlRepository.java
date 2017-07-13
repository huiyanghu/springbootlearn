package com.hhy.springbootlearn.repository;

import com.hhy.springbootlearn.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hhy on 17/7/10.
 */
@Repository
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
