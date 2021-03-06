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
    if (this.arrayList.size() != arrayList.size()) {
      return false;
    }
    for (int i = 0; i < arrayList.size(); i++) {
      if (this.arrayList.get(i) != arrayList.get(i)) {
        return false;
      }
    }
    return true;
  }

  //实现接口SingleLink，然后再此函数内使用
  public Double getMedianInLinkList(SingleLink singleLink) {
    for (int i : arrayList) {
      singleLink.addTailPointer(i);
    }
    if (arrayList.size() % 2 == 1) {
      return (double)((Integer)singleLink.getNode(arrayList.size()/ 2));
    } else {
      return
          (double)((Integer) singleLink.getNode(arrayList.size() / 2) + (Integer) singleLink
              .getNode(arrayList.size() / 2 + 1))
              / 2;
    }
  }

  public int getLastOdd() {
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      if (arrayList.get(i) % 2 == 1) {
        return arrayList.get(i);
      }
    }
    return -1;
  }

  public int getIndexOfLastOdd() {
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      if (arrayList.get(i) % 2 == 1) {
        return i;
      }
    }
    return -1;
  }
}
