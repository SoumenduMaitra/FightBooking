package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
