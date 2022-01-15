package com.store.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.demo.model.UserEntity;
 
@Repository
public interface UserRepository
        extends JpaRepository<UserEntity, Long> {
 
}


