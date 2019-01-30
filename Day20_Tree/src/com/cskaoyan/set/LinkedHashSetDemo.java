package com.cskaoyan.set;

import java.util.LinkedHashSet;

/*
    LinkedHashSet:具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("hello");
        linkedHashSet.add("world");

        for (String s : linkedHashSet) {
            System.out.print(s + " ");
        }
    }
}
