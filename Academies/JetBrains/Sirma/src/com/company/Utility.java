package com.company;

import java.util.Arrays;

public class Utility {
    public Integer[] numbers(Integer[] arr1,Integer[] arr2){
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    continue;
                }else{
                    result[i]=arr1[i];
                }

            }
            
        }
            
        }
    }
}
