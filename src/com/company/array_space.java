package com.company;
import java.util.*;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
    }

public class array_space {
    public static  ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> store = new ArrayList<Interval>();
        Interval temp =  new Interval(newInterval.start,newInterval.end);
        int i = 0;
        for(; i<intervals.size();i++){
            if (newInterval.end < intervals.get(i).start) {
                break;
            }
            if(intervals.get(i).end < newInterval.start)
                store.add(intervals.get(i));
            else{
                temp.start = Math.min(temp.start, intervals.get(i).start);
                temp.end = Math.max(temp.end, intervals.get(i).end);
            }

        }
        store.add(temp);
        for(; i<intervals.size();i++)
            store.add(intervals.get(i));

        return store;
    }

    public static void main(String[] args) {
        ArrayList<Interval> store = new ArrayList<Interval>();
        Interval temp1 = new Interval(1, 5);
        Interval temp2 = new Interval(2, 3);
        store.add(temp1);
//        store.add(temp2);
        Interval temp = new Interval(0, 0);
        ArrayList<Interval> hh = new ArrayList<Interval>();
        hh = insert(store,temp);
        for(Interval i: hh)
            System.out.println(i.end);

        }

}
