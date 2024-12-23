package com.janeaston.aboutlanguage;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends BaseActivity {

    private RadioGroup radioGroup_LanguageSelect;
    private RadioButton radioButton_Chinese;
    private RadioButton radioButton_English;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
    }

    private void initWidgets() {
        radioGroup_LanguageSelect = findViewById(R.id.radioGroup_LanguageSelect);
        radioButton_Chinese = findViewById(R.id.radioButton_Chinese);
        radioButton_English = findViewById(R.id.radioButton_English);

        String language = SharedPrefUtils.getString(this, "Language", Locale.SIMPLIFIED_CHINESE.toString());
        if(language.equals(Locale.SIMPLIFIED_CHINESE.toString())) {
            radioButton_Chinese.setChecked(true);
        } else if(language.equals(Locale.ENGLISH.toString())){
            radioButton_English.setChecked(true);
        }

        radioGroup_LanguageSelect.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String lan = "";
                if(checkedId == radioButton_Chinese.getId()) {
                    lan = Locale.SIMPLIFIED_CHINESE.toString();
                } else if(checkedId == radioButton_English.getId()){
                    lan = Locale.ENGLISH.toString();
                }
                SharedPrefUtils.putString(MainActivity.this, "Language", lan);
                Toast.makeText(MainActivity.this, "重启生效", Toast.LENGTH_SHORT).show();
            }
        });
    }
}