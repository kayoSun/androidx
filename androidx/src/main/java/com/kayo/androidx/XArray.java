package com.kayo.androidx;

import java.util.ArrayList;
import java.util.Collection;

/**
 * KayoSun
 * 2019-01-26
 * 23:41
 * ----------
 */
public class XArray<V> extends ArrayList<V> implements XList<V>{

    public XArray(int initialCapacity) {
        super(initialCapacity);
    }

    public XArray() {
    }

    public XArray(Collection<? extends V> c) {
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
