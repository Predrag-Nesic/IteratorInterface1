package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        for(Object c : c1) {
            System.out.println(c);
        }

        System.out.println();

        MyClass2 c2 = new MyClass2();
        for(Object c : c2) {
            System.out.println(c);
        }

        System.out.println();

        ArrayList arrayList = new ArrayList();
        arrayList.add(c1);
        arrayList.add(c2);
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            for (Iterator it = iterator; it.hasNext(); ) {
                Object c = it.next();
                System.out.println(c);
            }
        }

        System.out.println();

        String s1 = "Jack";
        String s2 = "Aku";
        String s3 = "John";

        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        Iterator iterator1 = set.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
