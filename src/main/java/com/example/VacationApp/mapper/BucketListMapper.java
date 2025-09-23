package com.example.VacationApp.mapper;

import com.example.VacationApp.dto.BucketListDto;
import com.example.VacationApp.entity.BucketList;

public class BucketListMapper{

    public static BucketList mapToEntity (BucketListDto bucketListDto){
        BucketList bucketList = new BucketList(
            bucketListDto.getActivity()
        );
        return bucketList;
    }

    public static BucketListDto mapToDto (BucketList bucketList){
        BucketListDto bucketListDto = new BucketListDto(
            bucketList.getId(),
            bucketList.getActivity()
        );
        return bucketListDto;
    }
}