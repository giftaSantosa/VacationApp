package com.example.VacationApp.service;

import com.example.VacationApp.dto.BucketListDto;

public interface VacationService {

    String addActivity(BucketListDto bucketListDto);

    String randomActivity();
} 
