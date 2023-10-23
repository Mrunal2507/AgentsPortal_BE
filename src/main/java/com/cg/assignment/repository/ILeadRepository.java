package com.cg.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.assignment.entity.Agent;

@Repository
public interface ILeadRepository extends JpaRepository<Agent, Integer>{

}
