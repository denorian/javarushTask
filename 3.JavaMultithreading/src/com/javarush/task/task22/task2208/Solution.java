package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {

        StringBuffer result =  new StringBuffer("");

        for (Map.Entry<String, String> entry: params.entrySet()) {
            if (entry.getValue() != null) {
                if (!"".equals(result.toString())) {
                    result.append(" and ");
                }
                result.append(entry.getKey());
                result.append(" = '");
                result.append(entry.getValue());
                result.append("'");
            }
        }
        return result.toString();
    }
}
