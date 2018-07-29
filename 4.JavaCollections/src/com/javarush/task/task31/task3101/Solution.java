package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {

        File dir = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File dest = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, dest);
        try (FileOutputStream writer = new FileOutputStream(dest)) {
            ArrayList<File> list = new ArrayList<>();
            Files.walkFileTree(dir.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toFile().length() > 50) {
                        FileUtils.deleteFile(file.toFile());
                    }
                    else {
                        list.add(file.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            list.sort(Comparator.comparing(File::getName));
            for (File file : list) {
                System.out.println(file);
                FileReader reader = new FileReader(file);
                int symbol;
                while ((symbol = reader.read()) != -1) {
                    writer.write(symbol);
                }
                reader.close();
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
