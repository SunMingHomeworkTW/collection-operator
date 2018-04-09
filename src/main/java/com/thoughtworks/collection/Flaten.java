package com.thoughtworks.collection;

import java.util.ArrayList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> oneDimesionalList=new ArrayList<>();
        for(Integer[] arr:array){
            for(int i:arr){
                oneDimesionalList.add(i);
            }
        }
        return oneDimesionalList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        throw new NotImplementedException();
    }
}
