package com.yzy.my_scaffold.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author YangZhenYuan
 * @Date 2020/3/22 18:31
 * @Version 1.0
 * @Describe
 */
public class MyController {
  @RequestMapping("/MyController/nihao")
  public String nihao(HttpServletRequest request, HttpServletResponse response)
  {
      return "";
  }

}
