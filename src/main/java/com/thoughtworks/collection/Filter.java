package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenList=new ArrayList<>();
        for(int i:array){
            if(i%2==0)
                evenList.add(i);
        }
        return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> multipleOfThreeList=new ArrayList<>();
        for(int i:array){
            if(i%3==0)
                multipleOfThreeList.add(i);
        }
        return multipleOfThreeList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> differentSet=new HashSet<>(array);
        List<Integer> differentElementList=new ArrayList<>(differentSet);
        return differentElementList;
    }
}