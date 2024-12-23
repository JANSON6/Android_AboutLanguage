package com.janeaston.aboutlanguage;

import android.content.res.Configuration;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class BaseActivity extends AppCompatActivity  {

    @Override
    protected void attachBaseContext(Context newBase) {
        // 根据 SharedPrefUtils 设置语言
        String language = SharedPrefUtils.getString(newBase, "Language", Locale.SIMPLIFIED_CHINESE.toString());
        Locale locale;
        if (language.equals(Locale.SIMPLIFIED_CHINESE.toString())) {
            locale = Locale.SIMPLIFIED_CHINESE;
        } else if (language.equals(Locale.ENGLISH.toString())) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.getDefault();
        }

        Locale.setDefault(locale);

        Configuration config = newBase.getResources().getConfiguration();
        config.setLocale(locale);
        Context context = newBase.createConfigurationContext(config);
        super.attachBaseContext(context);

    }
}
