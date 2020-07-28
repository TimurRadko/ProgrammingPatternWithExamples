package com.timurradko.adapter_example2;

import java.util.*;

public class TestingAdapter {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList("Java", "C++", "C", "C#", "JavaScript"));
        Iterator<?> iterator = new EnumerationIterator<>(v.elements());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        List<String> l = new ArrayList<>(Arrays.asList("Java", "C++", "C", "C#", "JavaScript"));
        Enumeration<?> enumeration = new IteratorEnumeration<>(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
