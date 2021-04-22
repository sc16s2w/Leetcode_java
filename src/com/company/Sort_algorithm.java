package com.company;
import java.util.*;
import java.util.Map.Entry;

public class Sort_algorithm {
    public static void sort(int sort, TreeMap map) {
        //这里将map.entrySet()转换成list
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        if (sort == 0){
            Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
                //降序排序
                public int compare(Entry<String, Integer> o1,
                                   Entry<String, Integer> o2) {
                    int compare = (o1.getValue()).compareTo(o2.getValue());
                    return -compare;
                }

            });
        }
        else if(sort == 1){
            Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
                //升序排序
                public int compare(Entry<String, Integer> o1,
                                   Entry<String, Integer> o2) {
                    int compare = (o1.getValue()).compareTo(o2.getValue());
                    return compare;
                }
            });
        }

        for(Map.Entry<String,Integer> mapping:list){
            System.out.println(mapping.getKey()+" "+mapping.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Map<String, Integer> map = new TreeMap<String, Integer>();
            String input = sc.nextLine();
            String input_2 = sc.nextLine();
            int m = Integer.parseInt(input);
            int n = Integer.parseInt(input_2);
            for (int i = 0; i < m; i++) {
                String s = sc.nextLine();// 一个一个读取
                String[] arr = s.split("\\s+");
                int value = Integer.parseInt(arr[1]);
                map.put(arr[0], value);
            }
            sort(n, (TreeMap) map);
            map.clear();
        }
    }
}