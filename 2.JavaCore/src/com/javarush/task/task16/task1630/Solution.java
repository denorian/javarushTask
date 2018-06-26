package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static String firstFileName;
    public static String secondFileName;

    static  //add your code here - добавьте код тут
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException
    {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException
    {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface
    {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private String        fileInput;
        private StringBuilder fileContent=new StringBuilder();

        @Override
        public void setFileName(String fullFileName)
        {
            fileInput = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            return fileContent.toString();
        }

        public void run()
        {
            try
            {
                BufferedReader fileReader = new BufferedReader(new FileReader(this.fileInput));
                String         str;
                while ((str = fileReader.readLine()) != null)
                {
                    fileContent.append(str);
                    fileContent.append(" ");
                }
                fileReader.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}