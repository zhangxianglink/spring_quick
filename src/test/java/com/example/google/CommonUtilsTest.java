package com.example.google;

import com.google.common.base.Function;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import org.apache.catalina.User;
import org.junit.Test;

import java.util.Objects;

/**
 * @author xiang.z
 * @since 2021-05-25 15:09
 */
public class CommonUtilsTest {

    @Test
    public void test(){
        // equals
        String b = "true";
        System.out.println(Objects.equals(b,null));

        // hashCode
        System.out.println(Objects.hashCode(b));

        // compare 1 0 -1
        System.out.println(ComparisonChain.start().compare(1, 1).compareFalseFirst(false, false).result());

    }

    /**
     * guava排序 http://ifeve.com/google-guava-ordering/
     */
    @Test
    public void orderTest(){
        /**
         *  java8 就挺好，一些简单方法可以试试
         方法	描述	另请参见
         greatestOf(Iterable iterable, int k)	获取可迭代对象中最大的k个元素。	leastOf
         isOrdered(Iterable)	判断可迭代对象是否已按排序器排序：允许有排序值相等的元素。	isStrictlyOrdered
         sortedCopy(Iterable)	判断可迭代对象是否已严格按排序器排序：不允许排序值相等的元素。	immutableSortedCopy
         min(E, E)	返回两个参数中最小的那个。如果相等，则返回第一个参数。	max(E, E)
         min(E, E, E, E...)	返回多个参数中最小的那个。如果有超过一个参数都最小，则返回第一个最小的参数。	max(E, E, E, E...)
         min(Iterable)	返回迭代器中最小的元素。如果可迭代对象中没有元素，则抛出NoSuchElementException。	max(Iterable), min(Iterator), max(Iterator)
         */
    }




}
