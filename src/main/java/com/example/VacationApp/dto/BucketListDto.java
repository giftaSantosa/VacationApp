package com.example.VacationApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //this automatically add constructor, getter, and setter methods
@AllArgsConstructor
public class BucketListDto {
    private Long id;
    private String activity;
}