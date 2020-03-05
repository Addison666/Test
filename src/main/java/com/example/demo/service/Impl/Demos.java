package com.example.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author THLiu i531384
 */
public class Demos extends DemoTest<String, Object> {


  public Demos(List<String> list) {
    super(list);
  }


  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("test");
    Demos demos = new Demos(list);
    demos.getList().forEach(r -> {
      System.out.println(r);
    });

  }
}
