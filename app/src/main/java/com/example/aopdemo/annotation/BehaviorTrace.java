package com.example.aopdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  * author : xia chen hui
  * email : 184415359@qq.com
  * date : 2019/8/23/023 8:03
  * desc : 性能监控
  *
**/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BehaviorTrace {

    String value();


}
