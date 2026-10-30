package com.wj.springbootreference.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyListener {
    List<String> list = Arrays.asList(new String[]{"a", "b", "c"});
    public void takeAction(Consumer<String> action, Consumer<MyAction> myAction) {
        list.forEach(action);
        MyAction my = new MyAction();
        myAction.accept(my);
    }
}
