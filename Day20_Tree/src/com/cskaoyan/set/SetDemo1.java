package com.cskaoyan.set;

import java.util.HashSet;

/*
 * Set: 一个不包含重复元素的 collection。更确切地讲，set 不包含满足 e1.equals(e2) 的元素对 e1 和 e2，
 * 并且最多包含一个 null 元素。正如其名称所暗示的，此接口模仿了数学上的 set 抽象。
 *
 * HashSet: 此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。
 * 它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
 *
 * HashSet是由HashMap来保证它插入元素的唯一性的
 */
public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");

        // 插入的顺序和底层排序顺序是无关
        for (String s : hashSet) {
            System.out.print(s + " ");
        }
    }
}
