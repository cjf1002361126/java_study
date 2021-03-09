package basic.syntax;

import basic.syntax.utils.Lists;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* @description 
* @author  cjf
* @create 2020-12-20 18:09
*/
public class StreamCase {

    public void testCount1() {

        List<String> list = Lists.newArrayList("a", "b", "ab", "abc", "a", "ab", "a", "abcd", "bd", "abc");

        Map<String, Long> countMap = new HashMap<>();
        for (String data : list) {
            Long aLong = countMap.get(data);
            if (Objects.isNull(aLong)) {
                countMap.put(data, 1L);
            } else {
                countMap.put(data, ++aLong);
            }
        }

        countMap.forEach((key, value) -> System.out.println("key:" + key + " value:" + value));
    }

    public void testCount2() {
        List<String> list = Lists.newArrayList("a", "b", "ab", "abc", "a", "ab", "a", "abcd", "bd", "abc");
        Map<String, Long> countMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countMap.forEach((key, value) -> System.out.println("key:" + key + " value:" + value));
    }

    public void testFilter() {
        List<Integer> list = Lists.newArrayList(20, 23, 25, 28, 30, 33, 37, 40);
        //从指定数据集合中过滤出大于等于30的数据集合
        List<Integer> collect = list.stream().filter(x -> x >= 30).collect(Collectors.toList());
        //结果：[33, 37, 40]
        System.out.println(collect);
    }

    public static void main(String[] args) {
        StreamCase streamCase = new StreamCase();
//        streamCase.testCount1();
        streamCase.testCount2();

        List<Integer> list = Lists.newArrayList(2, 3, 5, 7);
        Integer sum1 = list.stream().reduce(0, Integer::sum);
        //结果：17
        System.out.println(sum1);
    }
}
