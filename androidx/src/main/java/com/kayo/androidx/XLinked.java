package com.kayo.androidx;

import java.util.Collection;
import java.util.LinkedList;

/**
 * KayoSun
 * 2019-01-26
 * 23:43
 * ----------
 */
public class XLinked<V> extends LinkedList<V> implements XList<V>{

    public XLinked() {
    }

    public XLinked(Collection<? extends V> c) {
        super(c);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public final boolean notEmpty(){
        return !isEmpty();
    }
}
