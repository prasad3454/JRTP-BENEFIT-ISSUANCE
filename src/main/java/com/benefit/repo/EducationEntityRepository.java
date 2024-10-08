package com.benefit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.DCEducationEntity;

public interface EducationEntityRepository extends JpaRepository<DCEducationEntity, Serializable>{
	
	public DCEducationEntity findByCaseNum(Long caseNum);
}
