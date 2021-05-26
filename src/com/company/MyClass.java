package com.company;

import java.util.Iterator;

public class MyClass implements Iterable<Object> {
    protected String[] students = {"Jack", "Aku", "John"};
    protected int current = 0;

    @Override
    public Iterator<Object> iterator() {
        return new SomeClass();
    }

//    this is for now the simplest way to use iterator method, every time we use the for each loop, the iterator method is called upon
//    by creating the private class

    private class SomeClass implements Iterator<Object> {

        @Override
        public boolean hasNext() {
            return current < students.length;
        }

        @Override
        public Object next() {
            return students[current++];
        }
    }
}

// this can be done also, but we must make upper class a parent and extend it to the lower, or child, class. BUT we can now
// make new SomeClass-es in the Main method. Lower classes should be only made inside upper to serve them

class SomeClass extends MyClass implements Iterator<Object> {

    @Override
    public boolean hasNext() {
        return current < students.length;
    }

    @Override
    public Object next() {
        return students[current++];
    }
}


