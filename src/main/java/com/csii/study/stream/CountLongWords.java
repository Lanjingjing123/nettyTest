package com.csii.study.stream;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * 对比for迭代器与流式处理
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("alice30.txt")),StandardCharsets.UTF_8);

        List<String> words = Arrays.asList(contents.split("\r"));

        System.out.println(words);
        long count = 0 ;
        for (String word:words) {
            if (word.length()>3){
                count++;
            }
        }
        System.out.println("count= "+count);
        System.out.println("==================================");

        // 流式处理
        count = words.stream().filter(word -> word.length() > 3).count();
        System.out.println("count: "+count);

    }
}
