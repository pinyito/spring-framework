package com.eriapinyiothieno.srpingframework;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgorithm{
    //Detaching the sort logic from the search logic
    public void sortAlgo (){
        System.out.println("Bubble sort Algorithm");
    }
}
