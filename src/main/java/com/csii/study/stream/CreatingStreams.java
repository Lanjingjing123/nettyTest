package com.csii.study.stream;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {

    }

    public static void show(String title, Stream stream){
        final int SIZE = 10;
        List firstElement = (List) stream.limit(SIZE+1).collect(Collectors.toList());
    }
}
