package com.sky.spring.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {
	@Id
	private Long id;
	private String username;
	private String role;
	private String password;

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", username='" + username + '\'' +
			", role='" + role + '\'' +
			", password='" + password + '\'' +
			'}';
	}
}
