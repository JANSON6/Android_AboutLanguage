package com.janeaston.aboutlanguage;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        applyLanguageSettings();
    }

    /**
     * 根据 SharedPrefUtils 获取的 Language 字段设置语言
     */
    private void applyLanguageSettings() {
        String language = SharedPrefUtils.getString(this, "Language", Locale.SIMPLIFIED_CHINESE.toString());

        Locale locale;
        if (language.equals(Locale.SIMPLIFIED_CHINESE.toString())) {
            locale = Locale.SIMPLIFIED_CHINESE;
        } else if (language.equals(Locale.ENGLISH.toString())) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.getDefault(); // 如果未设置，使用系统默认语言
        }

        Locale.setDefault(locale);

        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }
}
