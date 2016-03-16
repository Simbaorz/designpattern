package com.simbaorz.sample.Iterator;

/**
 * Created by Simba on 2016/3/16.
 */
public interface Iterator<E> {

    public E getFirstElement();

    public boolean hasNext();

    public E nextElement();

}
