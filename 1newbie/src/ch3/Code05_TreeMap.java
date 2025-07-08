package ch3;

import java.util.TreeMap;

public class Code05_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"我是1");
        map.put(3,"我是3");
        map.put(2,"我是2");
        map.put(6,"我是6");
        map.put(5,"我是5");
        map.put(7,"我是7");

        System.out.println(map.firstKey());  //1
        System.out.println(map.lastKey());  //7
        System.out.println(map.floorKey(6)); //6
        System.out.println(map.ceilingKey(3)); //3

    }
}
