package com.skul.backend.ahm.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skul.backend.ahm.domain.AhmsdnisMstbrnd;


@Repository
public interface MstBrndRepository extends JpaRepository<AhmsdnisMstbrnd, String> {

	@Transactional
	 @Modifying
	@Query(value= "delete from AhmsdnisMstbrnd o where o.vbrndcd = :code")
	public void deletebrand(@Param(value = "code")String code);
	
	
	@Query(value= "select o from AhmsdnisMstbrnd o where o.vbrndcd = :code")
	public AhmsdnisMstbrnd findByCode(@Param(value = "code")String code);
	
	
}


