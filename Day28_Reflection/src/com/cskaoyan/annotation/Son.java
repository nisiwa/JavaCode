package com.cskaoyan.annotation;

import java.util.Date;

@MyAnnotation(name = "刘亦菲", value = String.class)
public class Son extends Father {

    @MyAnnotation(MaxLength = 5, value = Date.class)
    int i;

    @Override
    @Deprecated
    public void method1() {
        System.out.println("son: method1");
    }

    @MyAnnotation(String.class)
    public void method2() {
        System.out.println("son: method2");
    }
}
