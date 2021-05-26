package com.company;

import java.util.Iterator;

public class MyClass2 implements Iterable<Object> {
    protected String[] students = {"Jack", "Aku", "John"};
    protected int current = 0;

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {

//      this can also be done like this. We now are returning a simulation of a SomeObject object which has the two overriden methods
//      an Iterrator interface. This is called an annonimous class

            @Override
            public boolean hasNext() {
                return current < students.length;
            }

            @Override
            public Object next() {
                return students[current++];
            }
        };
    }
}


