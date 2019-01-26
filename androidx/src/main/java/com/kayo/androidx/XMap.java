package com.kayo.androidx;

import java.util.HashMap;
import java.util.Map;

/**
 * KayoSun
 * 2019-01-26
 * 23:22
 * ----------
 */
public class XMap<K,V> extends HashMap<K,V> {

    public XMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public XMap(int initialCapacity) {
        super(initialCapacity);
    }

    public XMap() {
    }

    public XMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public final boolean notEmpty(){
        return !isEmpty();
    }

    public boolean valueIsEmpty(K key){
        V v = get(key);
        return v == null;
    }
}
