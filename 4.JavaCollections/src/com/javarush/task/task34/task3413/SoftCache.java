package com.javarush.task.task34.task3413;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SoftCache {
    private Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        if (!cacheMap.containsKey(key))
            return null;

        SoftReference<AnyObject> softReference = cacheMap.get(key);
        return softReference.get();

    }

    public AnyObject put(Long key, AnyObject value) {
        SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));
        if (softReference != null) {
            AnyObject o = softReference.get();
            softReference.clear();
            return o;
        } else {
            return null;
        }


    }

    public AnyObject remove(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.remove(key);

        if (softReference != null) {
            AnyObject o = softReference.get();
            softReference.clear();
            return o;
        } else {
            return null;
        }
    }
}