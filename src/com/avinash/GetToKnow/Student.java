package com.avinash.GetToKnow;

// import java.util.ArrayList;
import java.util.*;

/**
 * Student
 */
public class Student {

    public static void main(String[] args) {
        List<Integer> people=new ArrayList<>();
        for(int i=1;i<8;i++){
            people.add(i);
        }
        while(people.size()>1){
            Iterator iter=people.iterator();
            for(int i =0;i<2;i++){
                if(!iter.hasNext()){
                    iter=people.iterator();
                }iter.next();
            }iter.remove();
        }
        System.out.println(people.get(0));
    }
}