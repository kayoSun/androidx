package com.kayo.androidx.json;

import android.support.annotation.NonNull;

/**
 * KayoSun
 * 2019-02-13
 * 17:29
 * ----------
 * json 解析器
 */
public interface XJsonParser {

    String toJson(@NonNull Object object);

    Object toEntity(@NonNull String json,@NonNull Class<?> clz);
}
