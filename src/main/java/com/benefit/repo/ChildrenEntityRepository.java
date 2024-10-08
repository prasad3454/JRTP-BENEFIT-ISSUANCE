package com.benefit.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.DCChildrenEntity;

public interface ChildrenEntityRepository extends JpaRepository<DCChildrenEntity, Serializable>{
	
	public List<DCChildrenEntity> findByCaseNum(Long caseNum);
}
