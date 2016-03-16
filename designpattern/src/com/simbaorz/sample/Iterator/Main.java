package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public class Main {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<100; ++i){
            arrayList.add(i);
        }

        Iterator<Integer> iterator = arrayList.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.nextElement());
        }
    }
}
