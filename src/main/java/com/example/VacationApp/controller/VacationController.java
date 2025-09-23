package com.example.VacationApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.VacationApp.dto.BucketListDto;
import com.example.VacationApp.service.VacationService;

@RestController
public class VacationController {
    
    private VacationService vacationService;
    public VacationController(VacationService vacationService){
        this.vacationService = vacationService;
    }

    //to add an activity
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addActivity(@RequestBody BucketListDto bucketListDto){
        return vacationService.addActivity(bucketListDto);
    }

    @GetMapping("/run")
    public String randomVacation(){
        return vacationService.randomActivity();
    }
}
