package com.example.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author THLiu i531384
 */
public class DemoTest<T, R> {

  private List<T> list;
  private R result;

  public DemoTest(List<T> list) {
    this.list = list;
    this.result = (R) list.get(0);
  }

  public List<T> getList() {
    return list;
  }

  public R getResult() {
    return result;
  }
}
