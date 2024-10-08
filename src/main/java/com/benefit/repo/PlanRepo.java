package com.benefit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Serializable>{

}
