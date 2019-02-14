package com.kayo.androidx.json;

import android.support.annotation.NonNull;

import com.google.gson.Gson;

/**
 * KayoSun
 * 2019-02-13
 * 17:33
 * ----------
 * 默认解析器
 */
class DefaultParser implements XJsonParser{

    static {
        try {
            Gson.class.getSimpleName();
        } catch (Throwable t) {
            throw new RuntimeException("You should add 'com.google.code.gson:gson:version' to your dependencies list first",t);
        }
    }

    private Gson mGson;

    private void checkGson(){
        if (mGson == null) {
            mGson = new Gson();
        }
    }

    @Override
    public String toJson(@NonNull Object object) {
        checkGson();
        return mGson.toJson(object);
    }

    @Override
    public Object toEntity(@NonNull String json, @NonNull Class<?> clz) {
        checkGson();
        return mGson.fromJson(json, clz);
    }
}
