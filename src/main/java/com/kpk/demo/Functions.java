package com.kpk.demo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functions {

    public static void main(String[] args){
        int[] arrayNumber = {1,1,2,3,4,5,5,6,7,8,9,12,56,56,57,58};
        dupElementsSizeFunc.accept(arrayNumber);

    }
    public static Consumer<int[]> dupElementsSizeFunc = arrayList -> {

        Map<Integer,Integer> counterMap = new HashMap<>();
        
        List<Integer> list = Arrays.stream(arrayList).boxed().collect(Collectors.toList());

        list.stream().forEach(
                it -> {
                    if (counterMap.containsKey(it)) {
                        counterMap.put(it, counterMap.get(it) + 1);
                    } else {
                        counterMap.put(it, 1);
                    }
                }
        );

        counterMap.entrySet().stream().forEach(
                integerIntegerEntry -> {
                    System.out.println("array value --> " +integerIntegerEntry.getKey() + " number of element --> "+integerIntegerEntry.getValue());
                }
        );

    };
}
