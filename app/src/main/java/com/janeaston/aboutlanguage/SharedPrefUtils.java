package com.janeaston.aboutlanguage;

import android.content.Context;
import android.content.SharedPreferences;

public final class SharedPrefUtils {

    private static final String PREF_NAME = "AppSettings";

    private SharedPrefUtils() {
        // 防止实例化
    }

    // 保存 String 值
    public static void putString(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    // 读取 String 值
    public static String getString(Context context, String key, String defaultValue) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getString(key, defaultValue);
    }

    // 保存 int 值
    public static void putInt(Context context, String key, int value) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    // 读取 int 值
    public static int getInt(Context context, String key, int defaultValue) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getInt(key, defaultValue);
    }

    // 保存 boolean 值
    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    // 读取 boolean 值
    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, defaultValue);
    }

    // 保存 float 值
    public static void putFloat(Context context, String key, float value) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    // 读取 float 值
    public static float getFloat(Context context, String key, float defaultValue) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getFloat(key, defaultValue);
    }

    // 保存 long 值
    public static void putLong(Context context, String key, long value) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    // 读取 long 值
    public static long getLong(Context context, String key, long defaultValue) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return preferences.getLong(key, defaultValue);
    }

    // 删除特定 key
    public static void remove(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(key);
        editor.apply();
    }

    // 清空所有数据
    public static void clear(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }


}
