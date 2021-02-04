package com.sky.spring.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

	@Query(value = "select u.username, u.password, u.role, u.id  from user u where u.username = ?1", nativeQuery = true)
	User findByName(String name);
}
