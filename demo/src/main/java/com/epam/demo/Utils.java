package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!StringUtils.isNumeric(arg) || Integer.parseInt(arg) <= 0) {
                return false;
            }
        }
        return true;
    }
}