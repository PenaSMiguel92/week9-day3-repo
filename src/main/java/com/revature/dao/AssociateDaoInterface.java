package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entity.Associate;

public interface AssociateDaoInterface extends JpaRepository<Associate, Integer> {
    
}
