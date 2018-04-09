package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> tripleList=new ArrayList<>();
        for(int i:array)
            tripleList.add(i*3);
        return tripleList;
    }

    public List<String> mapLetter() {
        List<String> mapLetterList=new ArrayList<>();
        for(int i:array)
            mapLetterList.add(letterList.get(i-1));
        return mapLetterList;
    }

    public List<String> mapLetters() {
        List<String> mapLettersList=new ArrayList<>();
        for(int i:array){
            String str= letterList.get((i+25)%26);
            while (i>26){
                i=(i-1)/26;
                str+=letterList.get((i+25)%26);
            }
            str=new StringBuilder(str).reverse().toString();
            mapLettersList.add(str);
        }
        return mapLettersList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> sortedFromBigList=new ArrayList<>(array);
        Collections.sort(sortedFromBigList,Collections.reverseOrder());
        return sortedFromBigList;
    }

    public List<Integer> sortFromSmall() {
        throw new NotImplementedException();
    }
}
