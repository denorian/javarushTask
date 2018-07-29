package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> resultList = new ArrayList<>();
        Stack<File> files = new Stack<>();

        files.push(new File(root));
        while (!files.isEmpty()){
            File currentFile = files.pop();

            if(currentFile.isDirectory()){
                for (File f : currentFile.listFiles()) {
                    files.push(f);
                }
            }

            if (currentFile.isFile()){
                resultList.add(currentFile.getAbsolutePath());
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        
    }
}
