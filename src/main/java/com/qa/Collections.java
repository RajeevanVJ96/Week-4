package com.qa;


import java.util.ArrayList;
import java.util.List;

public class Collections {


    public static void main(String[] args){
        onetohundred();
        onehtoninenine();
        mult10();
    }

    public static void onetohundred(){
        int array[] = new int[101];
        for (int i = 1; i < 101; i++){
            array[i] = i;
        }

        for (int i : array){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> onehtoninenine(){
        ArrayList<Integer> nums = new ArrayList();
        for (int i = 100; i < 1000; i++){
            nums.add(i);
        }

        return nums;
    }

    public static void mult10(){
        ArrayList<Integer> used = onehtoninenine();
        for (int i: used){
            System.out.println(i*10);

        }
    }



}
