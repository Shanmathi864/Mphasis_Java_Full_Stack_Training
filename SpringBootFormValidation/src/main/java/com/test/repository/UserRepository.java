package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.test.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	/*@Query("select u from User u where u.firstname=?1")
	public User getByFirstname(String firstName);*/
	

}
