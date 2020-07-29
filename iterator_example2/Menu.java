package com.timurradko.iterator_example2;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
