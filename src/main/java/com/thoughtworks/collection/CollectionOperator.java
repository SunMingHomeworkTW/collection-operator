package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list=new ArrayList<>();
        if(left<=right){
            for (int i = left; i <=right ; i++) {
                list.add(i);
            }
        }else{
            for (int i = left; i >=right ; i--) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list=new ArrayList<>();
        if(left<=right){
            for (int i = left; i <=right ; i++) {
                if(i%2==0)
                list.add(i);
            }
        }else{
            for (int i = left; i >=right ; i--) {
                if(i%2==0)
                    list.add(i);
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenElementList=new ArrayList<>();
        for(int i:array){
            if(i%2==0)
                evenElementList.add(i);
        }
        return evenElementList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> commonElementList=new ArrayList<>();

        Arrays.sort(secondArray);
        for(int i:firstArray){
            if(Arrays.binarySearch(secondArray,i)>=0)
                commonElementList.add(i);
        }
        return commonElementList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> allElementList=new ArrayList<>();
        for(int i:firstArray){
            allElementList.add(i);
        }

        Arrays.sort(firstArray);
        for(int i:secondArray){
            if(Arrays.binarySearch(firstArray,i)<0)
                allElementList.add(i);
        }
        return allElementList;
    }
}
