package com.kayo.androidx;


import java.util.Map;
import java.util.Set;

/**
 * KayoSun
 * 2019-01-26
 * 23:19
 * ----------
 * HashMap<String,Object>
 */
public class ObjectMap extends XMap<String,Object> {
    public ObjectMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public ObjectMap(int initialCapacity) {
        super(initialCapacity);
    }

    public ObjectMap() {
    }

    public ObjectMap(Map<? extends String, ?> m) {
        super(m);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof ObjectMap)) {
            return false;
        }
        ObjectMap temp = (ObjectMap) o;
        if (this.size() != temp.size()) {
            return false;
        }
        Set<String> keys = keySet();
        for (String key : keys) {
            Object val1 = this.get(key);
            Object val2 = temp.get(key);
            if (val1 != val2) {
                return false;
            }
        }
        return true;
    }
}
