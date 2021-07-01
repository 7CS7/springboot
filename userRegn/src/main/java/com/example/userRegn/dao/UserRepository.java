package com.example.userRegn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.userRegn.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	@Query("SELECT u FROM User u where u.email=?1")
	User findByEmail(String email);
}
