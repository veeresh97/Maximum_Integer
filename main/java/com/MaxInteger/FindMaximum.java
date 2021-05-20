package com.MaxInteger;

import java.util.*;

public class FindMaximum {
    public Comparable findIntMaximum(List myNumberList) {
        Comparable max = Collections.max(myNumberList);
        return max;
    }
    public Comparable findFloatMaximum(List myDoubleList) {
        Comparable max = Collections.max(myDoubleList);
        return max;
    }
    public static Comparable findStringMaximum(List myStringList) {
        Comparable max = Collections.max(myStringList);
        return max;
    }
}
