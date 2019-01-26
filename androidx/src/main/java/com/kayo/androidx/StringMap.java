package com.kayo.androidx;

import java.util.Map;
import java.util.Set;

/**
 * KayoSun
 * 2019-01-26
 * 23:19
 * ----------
 * HashMap<String,String>
 */
public class StringMap extends XMap<String, String> {

    public StringMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public StringMap(int initialCapacity) {
        super(initialCapacity);
    }

    public StringMap() {
    }

    public StringMap(Map<? extends String, ? extends String> m) {
        super(m);
    }

    @Override
    public boolean valueIsEmpty(String key) {
        String s = get(key);
        return s == null || s.trim().length() == 0;
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
        if (!(o instanceof StringMap)) {
            return false;
        }
        StringMap temp = (StringMap) o;
        if (this.size() != temp.size()) {
            return false;
        }
        Set<String> keys = keySet();
        for (String key : keys) {
            String val1 = this.get(key);
            String val2 = temp.get(key);
            if (!strIsSame(val1, val2)) {
                return false;
            }
        }
        return true;
    }

    private boolean strIsSame(String s1, String s2) {
        if (s1 != null && s2 != null) {
            return s1.equals(s2);
        }
        return s1 == null && s2 == null;
    }
}
