package com.cskaoyan.annotation;

public @interface MyAnnotation {
    //定义体
    String name() default "";

    int MaxLength() default 10;

    Class value();
}
