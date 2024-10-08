package com.benefit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.DCIncomeEntity;

public interface IncomeEntityRepository extends JpaRepository<DCIncomeEntity, Serializable>{
	
	public DCIncomeEntity findBycaseNum(Long caseNum);
}
