package com.wj.springbootreference.Iterate;

public class ItemTest {
    public static void main(String[] args) {
        Items items = new Items();
        for(Item item : items) {
            System.out.println(item);
        }
    }
}
