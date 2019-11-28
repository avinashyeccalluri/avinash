package com.avinash.GetToKnow;

/**
 * Madam
 */
public class Madam {

    public static void main(String[] args) {
        String a="madam";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(b);
        System.out.println(a.equals(b));
    }

}