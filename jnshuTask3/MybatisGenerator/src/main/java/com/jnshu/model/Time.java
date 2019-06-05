package com.jnshu.model;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

//这个类是把时间获取和转换封装起来
public class Time {
      //静态方法,字符串转换成数值
     public Long stringToNumber(String st){
          Long time = (new SimpleDateFormat("yyyy年MM月dd日HH时mm分")).parse(st, new ParsePosition(0)).getTime();
          return time;
      }
      //静态方法,数值转换成字符串
      public String numberToString(Long num){
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分");
          String time = sdf.format(new Date(Long.parseLong(String.valueOf(num))));
          return time;
      }
      //获得当前的时间戳
      public Long getTime(){
          Long time = System.currentTimeMillis();
          return time;
      }
}
