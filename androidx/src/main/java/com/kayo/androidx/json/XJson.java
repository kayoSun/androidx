package com.kayo.androidx.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * KayoSun
 * 2019-02-13
 * 17:30
 * ----------
 */
public class XJson {

    private XJsonParser mParser;
    private JSONObject mObject;

    public XJson() {
        this(null, "{}");
    }

    public XJson(String json) {
        this(null, json);
    }

    public XJson(XJsonParser parser) {
        this(parser, "{}");
    }

    public XJson(XJsonParser parser, String json) {
        this.mParser = parser;
        try {
            this.mObject = new JSONObject(json);
        } catch (JSONException e) {
            this.mObject = new JSONObject();
        }
        if (this.mParser == null) {
            this.mParser = new DefaultParser();
        }
    }

    public XJson bindJson(String json) {
        try {
            mObject = new JSONObject(json);
        } catch (JSONException ignored) {
        }
        return this;
    }

    public String toJson() {
        if (mParser != null) {
            return mParser.toJson(toString());
        }
        return "";
    }

    public Object toEntity(Class<?> clz) {
        if (mParser != null) {
            return mParser.toEntity(toString(), clz);
        }
        return null;
    }

    public String getString(String... keys) {
        if (keys == null || keys.length == 0) {
            return "";
        }
        if (keys.length == 1) {
            return mObject.optString(keys[0]);
        } else {
            JSONObject object = mObject;
            for (int i = 0; i < keys.length; i++) {
                if (object == null) {
                    return "";
                }
                String key = keys[i];
                if (i != keys.length - 1) {
                    object = object.optJSONObject(key);
                } else {
                    return object.optString(key);
                }
            }
        }
        return "";
    }

    public int getInt(String... keys) {
        if (keys == null || keys.length == 0) {
            return 0;
        }
        try {
            String string = getString(keys);
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public float getFloat(String... keys) {
        if (keys == null || keys.length == 0) {
            return 0;
        }
        try {
            String string = getString(keys);
            return Float.parseFloat(string);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public JSONObject getJsonObject(String... keys) {
        if (keys == null || keys.length == 0) {
            return null;
        }
        if (keys.length == 1) {
            return mObject.optJSONObject(keys[0]);
        } else {
            JSONObject object = mObject;
            for (int i = 0; i < keys.length; i++) {
                if (object == null) {
                    return null;
                }
                String key = keys[i];
                if (i != keys.length - 1) {
                    object = object.optJSONObject(key);
                } else {
                    return object.optJSONObject(key);
                }
            }
        }
        return null;
    }

    public JSONArray getJsonArray(String... keys) {
        if (keys == null || keys.length == 0) {
            return null;
        }
        if (keys.length == 1) {
            return mObject.optJSONArray(keys[0]);
        } else {
            JSONObject object = mObject;
            for (int i = 0; i < keys.length; i++) {
                if (object == null) {
                    return null;
                }
                String key = keys[i];
                if (i != keys.length - 1) {
                    object = object.optJSONObject(key);
                } else {
                    return object.optJSONArray(key);
                }
            }
        }
        return null;
    }

    public Object getEntity(Class<?> clz, String... keys) {
        if (keys == null || keys.length == 0 || mParser == null) {
            return null;
        }
        String json = getString(keys);
        return mParser.toEntity(json, clz);
    }

    public XJson put(String key, Object value) {
        try {
            mObject.put(key, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String toString() {
        return mObject.toString();
    }
}
