package com.wj.springbootreference.Iterate;

import java.util.Iterator;

public class Items implements Iterable<Item>{

    private Item root = new Item();
    @Override
    public Iterator<Item> iterator() {
        return root;
    }

}
