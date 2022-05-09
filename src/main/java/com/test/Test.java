package com.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测试stream速度
 * @author yanzhihao
 * @since 2022/5/9
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        Long end1 = System.currentTimeMillis();


//        List<Integer> list2 = new ArrayList<>();
//
//        Long start2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//            list2.add(i);
//        }
//        Long end2 = System.currentTimeMillis();

        log.info("end1 - start1 : {}", end1 - start1);
//        log.info("end2 - start2 : {}", end2 - start2);


//        test1(list);
//        test2(list);
    }

    private static void test1(List<Integer> list) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(1000000000)) {
                System.out.println();
            }
        }
        Long end = System.currentTimeMillis();

        log.info("test1 : end - start : {}", end - start);

    }

    private static void test2(List<Integer> list) {
        Long start = System.currentTimeMillis();
        List<Integer> result = list.parallelStream().filter(i -> i == 1000000000).collect(Collectors.toList());
        Long end = System.currentTimeMillis();

        log.info("test2: end - start : {}", end - start);

    }
}
