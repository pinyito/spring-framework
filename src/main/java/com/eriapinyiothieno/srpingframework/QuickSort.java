package com.eriapinyiothieno.srpingframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgorithm{
    //Detaching the sort logic from the search logic
    public void sortAlgo (){
        System.out.println("Quick sort Algorithm");
    }
}
