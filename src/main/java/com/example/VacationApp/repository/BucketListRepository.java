package com.example.VacationApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.VacationApp.entity.BucketList;

public interface BucketListRepository extends JpaRepository<BucketList,Long>{

    @Query("SELECT b.activity FROM BucketList b")
    List<String> findAllActivities();
    
} 
