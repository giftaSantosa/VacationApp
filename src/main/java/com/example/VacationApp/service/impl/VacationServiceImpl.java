package com.example.VacationApp.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.VacationApp.dto.BucketListDto;
import com.example.VacationApp.entity.BucketList;
import com.example.VacationApp.mapper.BucketListMapper;
import com.example.VacationApp.repository.BucketListRepository;
import com.example.VacationApp.service.VacationService;

@Service
public class VacationServiceImpl implements VacationService{
    
    private BucketListRepository bucketListRepository;

    public VacationServiceImpl(BucketListRepository bucketListRepository){
        this.bucketListRepository = bucketListRepository;
    }

    @Override
    public String addActivity(BucketListDto bucketListDto){
        BucketList bucketList = BucketListMapper.mapToEntity(bucketListDto);
        BucketList savedActivity = bucketListRepository.save(bucketList);
        return String.format("%s is saved on the bucket list", savedActivity.getActivity());
    }

    @Override
    public String randomActivity(){
        List<String> activities = bucketListRepository.findAllActivities();

        if (activities.isEmpty()){
            return "No activites found!";
        }

        int randomIndex = new Random().nextInt(activities.size());
        String randomActivity = activities.get(randomIndex);

        return "Your next trip should be "+ randomActivity;
    }



}
