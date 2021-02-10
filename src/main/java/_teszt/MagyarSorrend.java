package _teszt;

import java.text.*;
import java.util.*;

public class MagyarSorrend {
    public static void main(String args[]) throws Exception {
        String[] szavak = {"xilofon", "őr", "ablak", "űrszekér", "zászló", "ŰRHAJÓ", "kár", "Őslény", "üléshuzat"};
        TreeSet t = new TreeSet();
        for (int i = 0; i < szavak.length; i++) t.add(new String2(szavak[i]));
        Iterator iter = t.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

class String2 implements Comparable {

    public String value;
    private Collator collator = Collator.getInstance(new Locale("hu", "HU"));

    public String2(String value) {
        this.value = value;
    }

    public int compareTo(Object obj) {
        return collator.compare(value, obj.toString());
    }

    public String toString() {
        return value;
    }

    public boolean equals(Object obj) {
        return (obj.toString().equals(value));
    }
}

