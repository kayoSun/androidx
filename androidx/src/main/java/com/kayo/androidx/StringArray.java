package com.kayo.androidx;

import java.util.Collection;

/**
 * KayoSun
 * 2019-01-26
 * 23:50
 * ----------
 */
public class StringArray extends XArray<String> {
    public StringArray(int initialCapacity) {
        super(initialCapacity);
    }

    public StringArray() {
    }

    public StringArray(Collection<? extends String> c) {
        super(c);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
