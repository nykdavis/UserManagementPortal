package com.davis.bamra.nykdavis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davis.bamra.nykdavis.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>  {
	
	public List<UserDetails> findAll();

}
