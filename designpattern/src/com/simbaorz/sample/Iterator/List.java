package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public interface List<E> extends Collection<E>{
    public E remove(int pos);

    public void add(E element);

    public E get(int pos);

}
