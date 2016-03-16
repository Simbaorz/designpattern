package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public interface Collection<E> {
    public Iterator<E> getIterator();

    public int getSize();
}
