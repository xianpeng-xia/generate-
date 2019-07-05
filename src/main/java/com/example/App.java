package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(TimeUnit.DAYS.toMillis(1));
        long start = System.currentTimeMillis();
        Thread.sleep(TimeUnit.DAYS.toMillis(1));
        System.out.println(System.currentTimeMillis() - start + " ms");
        String str = UUID.randomUUID().toString();
        System.out.println(str.length() + " _ " + str);
        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "1");
        testMap.put("b", "2");
        testMap.put("symbol", "3");
        System.out.println(JSON.toJSONString(testMap, SerializerFeature.MapSortField));
        int random = ThreadLocalRandom.current().nextInt(1, 10);
        if (random == 10) {
            System.out.println(1);
        }
    }
}
