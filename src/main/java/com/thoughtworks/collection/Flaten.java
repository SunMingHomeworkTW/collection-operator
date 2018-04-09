package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
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
        Set<Integer> unrepeatedOneDimesionalSet=new LinkedHashSet<>(transformToOneDimesional());
        List<Integer> unrepeatedOneDimesionalList=new ArrayList<>(unrepeatedOneDimesionalSet);
        return unrepeatedOneDimesionalList;
    }
}
