package com.chandra.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandra.springboot.model.Users;

public interface UsersJpaRepository extends JpaRepository<Users, Long> {

	public Users findByName(String name);
}
