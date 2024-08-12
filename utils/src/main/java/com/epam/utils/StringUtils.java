package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         return StringUtils.isNumeric(str) && Integir.parseInt(str) > 0;
    }
    public void main(String[] args){
        String num = '42';
        if(isPositiveNumber(num)){
            System.out.println(num + " is positive number.");
        }else {
            System.out.println(num + " is not positive number.");
        }
    }
}
