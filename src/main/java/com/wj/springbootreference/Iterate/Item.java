package com.wj.springbootreference.Iterate;

import java.util.Iterator;
import java.util.Random;

public class Item implements Iterator<Item> {

    @Override
    public boolean hasNext() {
        int i = new Random().nextInt(10);
        return i >= 1;
    }

    @Override
    public Item next() {
        return this;
    }
}
