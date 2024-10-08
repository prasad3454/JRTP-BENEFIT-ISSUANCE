package com.benefit.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.CoTriggerEntity;



public interface CoTriggerEntityRepository extends JpaRepository<CoTriggerEntity, Serializable>{
	
	public List<CoTriggerEntity> findByTrgStatus(String status);
	
	public CoTriggerEntity findByCaseNum(Long caseNum);
}
