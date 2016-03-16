package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public class ListIterator<E> implements Iterator<E>{

    private List<E> innerList = null;
    private int currentPosition;
    private int count;

    public ListIterator(List<E> list){
        this.innerList = list;
        this.currentPosition = 0;
        this.count = innerList.getSize();
    }

    @Override
    public E getFirstElement() {
        return innerList.get(0);
    }

    @Override
    public boolean hasNext() {
        return currentPosition < innerList.getSize();
    }

    @Override
    public E nextElement() {
        return innerList.get(currentPosition++);
    }
}
