package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public class ArrayList<E> implements List<E> {
    public static int DEFAULT_INIT_SIZE = 80;
    public static double DEFAULT_RATE = 0.5;
    private Object[] elements;
    private int capacity;
    private double rate;
    private int size;

    public ArrayList(){
        elements = new Object[DEFAULT_INIT_SIZE];
        capacity = DEFAULT_INIT_SIZE;
        size = 0;
        rate = DEFAULT_RATE;
    }

    @Override
    public Iterator getIterator() {
        return new ListIterator(this);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public E remove(int pos) {
        return null;
    }

    @Override
    public void add(E element) {
        if(this.size == capacity){
            expands();
        }
        elements[this.size++] = element;
    }

    @Override
    public E get(int pos) {
        return (E)elements[pos];
    }

    private void expands(){
        int expandedCapacity = (int)(capacity * ( 1 + rate));
        Object[] temp = new Object[expandedCapacity];
        for(int i=0; i<capacity; ++i){
            temp[i] = elements[i];
        }
        elements = temp;
        capacity = expandedCapacity;
    }
}
