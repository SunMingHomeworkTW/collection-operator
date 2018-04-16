package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {

  public int getSumOfEvens(int leftBorder, int rightBorder) {
//    int sumOfEvents = 0;
//
//    if (leftBorder > rightBorder) {
//      int temp = leftBorder;
//      leftBorder = rightBorder;
//      rightBorder = temp;
//    }
//
//    for (int i = leftBorder; i <= rightBorder; i++) {
//      if (i % 2 == 0) {
//        sumOfEvents += i;
//      }
//    }
//
//    return sumOfEvents;
    int max=Math.max(leftBorder,rightBorder);
    int min=Math.min(leftBorder,rightBorder);
    return IntStream.rangeClosed(min,max).filter(i->i%2==0).sum();
  }

  public int getSumOfOdds(int leftBorder, int rightBorder) {
//    int sumOfOdds = 0;
//
//    if (leftBorder > rightBorder) {
//      int temp = leftBorder;
//      leftBorder = rightBorder;
//      rightBorder = temp;
//    }
//
//    for (int i = leftBorder; i <= rightBorder; i++) {
//      if (i % 2 == 1) {
//        sumOfOdds += i;
//      }
//    }
//
//    return sumOfOdds;
    int max=Math.max(leftBorder,rightBorder);
    int min=Math.min(leftBorder,rightBorder);
    return IntStream.rangeClosed(min,max).filter(i->i%2==1).sum();
  }

  public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//    int sumTripleAndAddTwo = 0;
////    for (int i : arrayList) {
////      sumTripleAndAddTwo += i * 3 + 2;
////    }
////    return sumTripleAndAddTwo;
    return arrayList.stream().mapToInt(i->i*3+2).sum();
  }

  public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//    for (int i = 0; i < arrayList.size(); i++) {
//      if (arrayList.get(i) % 2 == 1) {
//        arrayList.set(i, arrayList.get(i) * 3 + 2);
//      }
//    }
//    return arrayList;
    return arrayList.stream().map((i) -> {
      if (i%2==1)
      {
        return i*3+2;
      }
    return i;}).collect(Collectors.toList());
  }

  public int getSumOfProcessedOdds(List<Integer> arrayList) {
//    int sumOfProcessedOdds = 0;
//    for (int i : arrayList) {
//      if (i % 2 == 1) {
//        sumOfProcessedOdds += i * 3 + 5;
//      }
//    }
//    return sumOfProcessedOdds;
    return arrayList.stream().filter(i->i%2==1).mapToInt(i->i*3+5).sum();
  }

  public double getMedianOfEvenIndex(List<Integer> arrayList) {
//    List<Integer> evenIndexList = new ArrayList<>();
//    for (int i : arrayList) {
//      if (i % 2 == 0) {
//        evenIndexList.add(i);
//      }
//    }
//
//    if (evenIndexList.size() % 2 == 1) {
//      return evenIndexList.get(evenIndexList.size() / 2);
//    } else {
//      return
//          (double) (evenIndexList.get(evenIndexList.size() / 2) + evenIndexList
//              .get(evenIndexList.size() / 2 - 1))
//              / 2;
//    }
    List<Integer> evenIndexList=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
    return evenIndexList.size()%2==1?evenIndexList.stream().skip(evenIndexList.size() / 2).limit(1).mapToDouble(i->i).findFirst().getAsDouble()
        :evenIndexList.stream().skip(evenIndexList.size() / 2-1).limit(2).mapToDouble(i->i).average().getAsDouble();
  }

  public double getAverageOfEvenIndex(List<Integer> arrayList) {
//    List<Integer> evenIndexList = new ArrayList<>();
//    for (int i : arrayList) {
//      if (i % 2 == 0) {
//        evenIndexList.add(i);
//      }
//    }
//
//    double average = 0.0;
//    for (int i : evenIndexList) {
//      average += i;
//    }
//    return average / evenIndexList.size();
    return arrayList.stream().filter(i->i%2==0).mapToDouble(i->i).average().getAsDouble();
  }

  public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//    List<Integer> evenIndexList = new ArrayList<>();
//    for (int i : arrayList) {
//      if (i % 2 == 0) {
//        evenIndexList.add(i);
//      }
//    }
//
//    return evenIndexList.contains(specialElment);
    return arrayList.stream().filter(i->i%2==0).anyMatch(i->i==specialElment);
  }

  public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
//    List<Integer> evenIndexList = new ArrayList<>();
//    for (int i : arrayList) {
//      if (i % 2 == 0) {
//        evenIndexList.add(i);
//      }
//    }
//    Set<Integer> enenSet = new HashSet<>(evenIndexList);
//    return new ArrayList<>(enenSet);
    return arrayList.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
  }

  public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//    List<Integer> evenIndexList = new ArrayList<>();
//    List<Integer> oddIndexList = new ArrayList<>();
//    for (int i : arrayList) {
//      if (i % 2 == 0) {
//        evenIndexList.add(i);
//      } else {
//        oddIndexList.add(i);
//      }
//    }
//
//    Collections.sort(evenIndexList);
//    Collections.sort(oddIndexList);
//    for (int i = oddIndexList.size() - 1; i >= 0; i--) {
//      evenIndexList.add(oddIndexList.get(i));
//    }
//
//    return evenIndexList;
    List<Integer> evenIndexList=arrayList.stream().filter(i->i % 2 == 0).sorted().collect(Collectors.toList());
    List<Integer> oddIndexList=arrayList.stream().filter(i->i % 2 == 1).sorted((i1,i2)->i2-i1).collect(Collectors.toList());
    evenIndexList.addAll(oddIndexList);
    return evenIndexList;
  }

  public List<Integer> getProcessedList(List<Integer> arrayList) {
//    List<Integer> resultList = new ArrayList<>();
//    for (int i = 0; i < arrayList.size() - 1; i++) {
//      resultList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
//    }
//    return resultList;
    return IntStream.range(0,arrayList.size()).filter(i->i<arrayList.size()-1).map(i->((arrayList.get(i)+arrayList.get(i+1))*3)).mapToObj(i->i).collect(Collectors.toList());
  }
}
