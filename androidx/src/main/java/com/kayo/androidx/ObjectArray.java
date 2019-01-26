package com.kayo.androidx;

import java.util.Collection;

/**
 * KayoSun
 * 2019-01-26
 * 23:52
 * ----------
 */
public class ObjectArray extends XArray<Object> {

    public ObjectArray(int initialCapacity) {
        super(initialCapacity);
    }

    public ObjectArray() {
    }

    public ObjectArray(Collection<?> c) {
        super(c);
    }
}
