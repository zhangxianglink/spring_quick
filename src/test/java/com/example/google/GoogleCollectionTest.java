package com.example.google;

import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

/**
 * @author xiang.z
 * @since 2021-05-25 15:57
 */
public class GoogleCollectionTest {

    /**
     * 不可变集合
     * 不担心多线程，常量看待，不担心变化
     * 不接受null
     * http://ifeve.com/google-guava-immutablecollections/
     */
    @Test
    public void test(){
        System.out.println(ImmutableSortedSet.of(2, 4, 7, 1, 0, 9, 3, 2).asList().get(0));
    }

    /**
     * 新集合类型
     * Multimap a -> [1, 2, 4] b -> 3 c -> 5
     * Multiset [a,a] -> 2, b -> 1, [c,c,c,c,c] -> 5
     */
    @Test
    public void test2(){

    }

}
