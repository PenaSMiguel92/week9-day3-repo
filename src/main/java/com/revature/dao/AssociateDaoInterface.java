package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.revature.entity.Associate;

@Component
@Repository
public interface AssociateDaoInterface extends JpaRepository<Associate, Integer> {
    
}
