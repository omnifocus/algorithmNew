package newbie.ch3;

import java.util.HashMap;

public class Code04_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Integer a = 1122222;
        Integer b = 1122222;
        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d);
        System.out.println(a == b);
        map.put(1122222, "123");
        System.out.println(map.containsKey(b));


        HashMap<Node,String> nodeMap = new HashMap<>();

        Node n1 = new Node();
        Node n2 = new Node();
        nodeMap.put(n1,"abc");
        System.out.println(nodeMap.containsKey(n2));

    }

    static class Node {
        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }
}
