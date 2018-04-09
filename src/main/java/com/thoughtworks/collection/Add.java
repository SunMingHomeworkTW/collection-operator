package com.thoughtworks.collection;

import java.util.ArrayList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {

  public int getSumOfEvens(int leftBorder, int rightBorder) {
    int sumOfEvents = 0;

    if (leftBorder > rightBorder) {
      int temp = leftBorder;
      leftBorder = rightBorder;
      rightBorder = temp;
    }

    for (int i = leftBorder; i <= rightBorder; i++) {
      if (i % 2 == 0) {
        sumOfEvents += i;
      }
    }

    return sumOfEvents;
  }

  public int getSumOfOdds(int leftBorder, int rightBorder) {
    int sumOfOdds = 0;

    if (leftBorder > rightBorder) {
      int temp = leftBorder;
      leftBorder = rightBorder;
      rightBorder = temp;
    }

    for (int i = leftBorder; i <= rightBorder; i++) {
      if (i % 2 == 1) {
        sumOfOdds += i;
      }
    }

    return sumOfOdds;
  }

  public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    int sumTripleAndAddTwo = 0;
    for (int i : arrayList) {
      sumTripleAndAddTwo += i * 3 + 2;
    }
    return sumTripleAndAddTwo;
  }

  public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i) % 2 == 1) {
        arrayList.set(i, arrayList.get(i) * 3 + 2);
      }
    }
    return arrayList;
  }

  public int getSumOfProcessedOdds(List<Integer> arrayList) {
    int sumOfProcessedOdds = 0;
    for (int i : arrayList) {
      if (i % 2 == 1) {
        sumOfProcessedOdds += i * 3 + 5;
      }
    }
    return sumOfProcessedOdds;
  }

  public double getMedianOfEvenIndex(List<Integer> arrayList) {
    List<Integer> eventIndexList = new ArrayList<>();
    for (int i = 1; i <= arrayList.size() / 2+1; i=i+2) {
      eventIndexList.add(arrayList.get(i));
    }

    if (eventIndexList.size() % 2 == 1) {
      return eventIndexList.get(eventIndexList.size() / 2);
    } else {
      return
          (double) (eventIndexList.get(eventIndexList.size() / 2) + eventIndexList.get(eventIndexList.size() / 2 - 1))
              / 2;
    }
  }

  public double getAverageOfEvenIndex(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
    throw new NotImplementedException();
  }

  public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public List<Integer> getProcessedList(List<Integer> arrayList) {
    List<Integer> resultList = new ArrayList<>();
    for (int i = 0; i < arrayList.size() - 1; i++) {
      resultList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
    }
    return resultList;
  }
}
