package com.davis.bamra.nykdavis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davis.bamra.nykdavis.entity.LoginDetails;

@Repository
public interface LoginRepository extends JpaRepository<LoginDetails, Integer> {

	LoginDetails findByUserName(String userName);

}
