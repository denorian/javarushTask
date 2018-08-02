package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String tmp = args[0];
        args[0] = "";
        Arrays.sort(args);
        args[0] = tmp;
        List<FileInputStream> filePaths = new ArrayList<>();

        for (int i = 1; i < args.length; i++) {
            filePaths.add(new FileInputStream(args[i]));
        }

        try (
                ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(filePaths)));
                FileOutputStream fileOutputStream = new FileOutputStream(args[0]);
        ) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                byte[] buffer = new byte[8192];
                int strlen;
                while ((strlen = zipInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, strlen);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
