package com.cskaoyan.reflection;

import java.lang.reflect.Field;

/*
    工具类：
        给我一个对象，属性名，属性值。将这个属性值赋值给这个对象的属性
 */
public class Tool {
    private Tool() {

    }

    public static void setProperty(Object obj, String propertyName, Object value) throws Exception{
        //1. 获取字节码文件对象
        Class<?> clazz = obj.getClass();
        //2. 获取执行的字段
        Field field = clazz.getDeclaredField(propertyName);
        //3. 暴力访问
        field.setAccessible(true);
        //4. 设置属性值
        field.set(obj, value);
    }
}
