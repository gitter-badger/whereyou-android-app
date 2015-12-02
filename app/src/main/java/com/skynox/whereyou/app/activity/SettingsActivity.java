package com.skynox.whereyou.app.activity;

import android.os.Bundle;
import com.skynox.whereyou.app.R;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class SettingsActivity extends AbstractDefaultActivity {

    private int layout = R.layout.activity_settings;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout);
        initToolbar();
        initNavigationView();
    }

}