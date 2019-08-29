package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args){

 //       onetoHun();
 //       oneHtoNineNine();
        mult10();

    }

    public static void onetoHun(){
        int[] array = IntStream.rangeClosed(0,100).toArray();
        for (int i: array){
            System.out.println(i);
        }

    }

    public static List<Integer> oneHtoNineNine(){
        int[] array = IntStream.rangeClosed(100,999).toArray();
        List<Integer> nums = new ArrayList(Arrays.asList(array));
        return nums;

        }

    public static void mult10(){
        int[] array = IntStream.rangeClosed(100,999).toArray();
        Arrays.stream(array).map(i -> i * 10).forEach(System.out::println);

    }


}

