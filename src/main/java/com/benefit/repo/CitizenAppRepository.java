package com.benefit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benefit.entity.CitizenAppEntity;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity, Serializable>{

}
