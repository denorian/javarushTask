package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileNameString = args[0];
        String zipFileName = args[1];

        File fileName = new File(fileNameString);

        HashMap<String, ByteArrayOutputStream> archivedFiles = new HashMap<>();

        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileName))){
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null){
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int count = 0;
                while ((count = zipInputStream.read(buffer)) != -1){
                    byteArrayOutputStream.write(buffer,0,count);
                }
                archivedFiles.put(zipEntry.getName(),byteArrayOutputStream);
            }
        }

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFileName))) {
            for(Map.Entry<String,ByteArrayOutputStream> pair : archivedFiles.entrySet()){
                if (pair.getKey().substring(pair.getKey().lastIndexOf("/") + 1).equals(fileName.getName())) continue;
                zipOutputStream.putNextEntry(new ZipEntry(pair.getKey()));
                zipOutputStream.write(pair.getValue().toByteArray());
            }

            zipOutputStream.putNextEntry(new ZipEntry("new/" + fileName.getName()));
            Files.copy(fileName.toPath(), zipOutputStream);
        }
    }
}
