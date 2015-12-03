package com.skynox.whereyou.app.activity;

import android.os.Bundle;
import com.skynox.whereyou.app.R;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class SettingsActivity extends AbstractDefaultActivity {

    private final int LAYOUT = R.layout.activity_settings;
    private final String TAG = "SettingsActivity";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar(LAYOUT);
        initNavigationView();

    }

}