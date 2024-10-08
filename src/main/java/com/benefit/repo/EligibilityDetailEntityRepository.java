package com.benefit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.EligibilityDetailEntity;

public interface EligibilityDetailEntityRepository extends JpaRepository<EligibilityDetailEntity, Integer>{
	
	public EligibilityDetailEntity findByCaseNum(Long caseNum);
}
