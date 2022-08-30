package com.company;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

      //  Integer массивден жуп сандарды терип алыныздар жана алардын квадраттарынын эн чонун табыныз.

        Integer[] array = {312,140,99,77,525};
        Stream.of(array)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x )
                .max(Integer::compare).ifPresent(System.out::println);
    }
}