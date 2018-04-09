package com.thoughtworks.collection;

import java.util.ArrayList;
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
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
