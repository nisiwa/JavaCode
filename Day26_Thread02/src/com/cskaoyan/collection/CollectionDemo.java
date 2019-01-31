package com.cskaoyan.collection;

import java.util.*;

/*
    线程安全的类：
        Vector<E>
        HashTable<K, V>
        StringBuffer
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 前面说过即使要用线程安全的集合，我也不用 Vector.
        List<String> list = new ArrayList<>(); // ArrayList不是线程安全的
        List<String> list1 = Collections.synchronizedList(list);
        // list1就是线程安全的

        Set<String> set = new HashSet<>() ;// ArrayList不是线程安全的
        Set<String> set1 = Collections.synchronizedSet(set);
        //
        Map<String, String> map = new HashMap<>() ;// ArrayList不是线程安全的
        Map<String, String> map1 = Collections.synchronizedMap(map);
    }
}
