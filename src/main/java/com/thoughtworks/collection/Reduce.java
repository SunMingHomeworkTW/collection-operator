package com.thoughtworks.collection;

import java.util.Collections;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

  List<Integer> arrayList;

  public Reduce(List<Integer> arrayList) {
    this.arrayList = arrayList;
  }

  public int getMaximum() {
    return Collections.max(arrayList);
  }

  public double getMinimum() {
    return Collections.min(arrayList);
  }

  public double getAverage() {
    double average = 0.0;
    for (int i : arrayList) {
      average += i;
    }
    return average / arrayList.size();
  }

  public double getOrderedMedian() {
    if (arrayList.size() % 2 == 1) {
      return arrayList.get(arrayList.size() / 2);
    } else {
      return
          (double) (arrayList.get(arrayList.size() / 2) + arrayList
              .get(arrayList.size() / 2 - 1))
              / 2;
    }
  }

  public int getFirstEven() {
    for (int i : arrayList) {
      if (i % 2 == 0) {
        return i;
      }
    }
    return -1;
  }

  public int getIndexOfFirstEven() {
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i) % 2 == 0) {
        return i;
      }
    }
    return -1;
  }

  public boolean isEqual(List<Integer> arrayList) {
    throw new NotImplementedException();
  }

  //实现接口SingleLink，然后再此函数内使用
  public Double getMedianInLinkList(SingleLink singleLink) {
    throw new NotImplementedException();
  }

  public int getLastOdd() {
    throw new NotImplementedException();
  }

  public int getIndexOfLastOdd() {
    throw new NotImplementedException();
  }
}
