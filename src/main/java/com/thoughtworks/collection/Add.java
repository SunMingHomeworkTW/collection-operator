package com.thoughtworks.collection;

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
      sumTripleAndAddTwo += i*3+2;
    }
    return sumTripleAndAddTwo;
  }

  public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public int getSumOfProcessedOdds(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  public double getMedianOfEvenIndex(List<Integer> arrayList) {
    throw new NotImplementedException();
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
    throw new NotImplementedException();
  }
}
