package com.javarush.task.task36.task3606;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Осваиваем ClassLoader и Reflection
*/
public class Solution {
    private List<Class> hiddenClasses = new ArrayList<>();
    private String packageName;

    public Solution(String packageName) {
        this.packageName = packageName;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Solution solution = new Solution(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "com/javarush/task/task36/task3606/data/second");
        solution.scanFileSystem();
        System.out.println(solution.getHiddenClassObjectByKey("hiddenclassimplse"));
        System.out.println(solution.getHiddenClassObjectByKey("hiddenclassimplf"));
        System.out.println(solution.getHiddenClassObjectByKey("packa"));
    }

    public void scanFileSystem() throws ClassNotFoundException {
        File[] files = new File(packageName).listFiles();

        for (File file : files) {
            if( file.isDirectory() && !file.getName().endsWith(".class"))
                return;

            try {
                hiddenClasses.add(new ModuleLoader().load(file.getPath()));
            }catch (Exception e){}
        }
    }

    public HiddenClass getHiddenClassObjectByKey(String key) {
        for (Class c : hiddenClasses) {
            if (c.getSimpleName().toLowerCase().startsWith(key.toLowerCase())) {
                try {
                    Constructor[] constructors = c.getDeclaredConstructors();
                    for (Constructor constructor : constructors) {
                        if (constructor.getParameterTypes().length == 0) {
                            constructor.setAccessible(true);
                            return (HiddenClass) constructor.newInstance(null);
                        }
                    }
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    public class ModuleLoader extends ClassLoader {

        public Class load(String path) throws IOException {
            byte[] bytes = Files.readAllBytes(Paths.get(String.valueOf(path)));

            return defineClass(null, bytes, 0, bytes.length);
        }
    }
}

