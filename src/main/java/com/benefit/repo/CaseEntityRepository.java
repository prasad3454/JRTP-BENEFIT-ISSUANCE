package com.benefit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.DCCaseEntity;

public interface CaseEntityRepository extends JpaRepository<DCCaseEntity, Serializable>{
	
	public DCCaseEntity findByAppId(Integer id);
}
