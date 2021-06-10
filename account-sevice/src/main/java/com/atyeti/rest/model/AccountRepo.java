package com.atyeti.rest.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Long> {

	
	Account findByIdAndRollno(Long ID,String ROLLNO);
}
