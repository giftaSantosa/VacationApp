package com.example.VacationApp.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.VacationApp.dto.BucketListDto;
import com.example.VacationApp.entity.BucketList;
import com.example.VacationApp.repository.BucketListRepository;
import com.example.VacationApp.service.impl.VacationServiceImpl;

@ExtendWith(MockitoExtension.class)
public class VacationServiceImplTest {
    
    //create a fake repository
    @Mock
    private BucketListRepository bucketListRepository;

    //inject this to our service
    @InjectMocks
    private VacationServiceImpl vacationService;

    @Test
    void testAddActivity(){
        //create a new dto input
        BucketListDto input = new BucketListDto(1L, "Parasailing");

        //fake entity returned by repository
        BucketList savedEntity = new BucketList();
        savedEntity.setId(1L);
        savedEntity.setActivity("Parasailing");

        //Mock repository save method
        when(bucketListRepository.save(any(BucketList.class))).thenReturn(savedEntity);

        //call the service method
        String result = vacationService.addActivity(input);

        //Assert
        assertEquals("Parasailing is saved on the list", result, "addActivity method does not work");

        //Verify that activity is added
        verify(bucketListRepository, times(1)).save(any(BucketList.class));
    }

   
    }
    


