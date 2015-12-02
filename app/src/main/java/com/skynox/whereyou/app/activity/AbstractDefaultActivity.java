package com.skynox.whereyou.app.activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.skynox.whereyou.app.Config;
import com.skynox.whereyou.app.R;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class AbstractDefaultActivity extends AppCompatActivity {

    public Toolbar toolBar;
    public DrawerLayout drawerLayout;
    public NavigationView navigationView;


    @Override
    public void onResume() {
        super.onResume();
        updateToolbarMenu();
    }


    public void initToolbar() {
        toolBar = (Toolbar) findViewById(R.id.toolbar);
        toolBar.setTitle(R.string.app_name);
        toolBar.inflateMenu(R.menu.menu_toolbar);
        toolBar.setOnMenuItemClickListener(
                new Toolbar.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_toolbar_gps_state_on:
                                Config.STATUS_SYNC_GPS = false;
                                updateToolbarMenu();
                                break;
                            case R.id.action_toolbar_gps_state_off:
                                Config.STATUS_SYNC_GPS = true;
                                updateToolbarMenu();
                        }

                        return false;
                    }
                }
        );
    }


    public void initNavigationView() {
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.action_toggle_open, R.string.action_toggle_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        drawerLayout.closeDrawers();
                        switch (item.getItemId()) {
                            case R.id.action_navigation_map:
                                goToActivity(MapActivity.class);
                                break;
                            case R.id.action_navigation_people:
                                goToActivity(PeopleActivity.class);
                                break;
                            case R.id.action_navigation_settings:
                                goToActivity(SettingsActivity.class);
                                break;
                        }

                        return false;
                    }
                }
        );
    }


    public void updateToolbarMenu() {
        if (Config.STATUS_SYNC_GPS) {
            toolBar.getMenu().findItem(R.id.action_toolbar_gps_state_off).setVisible(false);
            toolBar.getMenu().findItem(R.id.action_toolbar_gps_state_on).setVisible(true);
        } else {
            toolBar.getMenu().findItem(R.id.action_toolbar_gps_state_off).setVisible(true);
            toolBar.getMenu().findItem(R.id.action_toolbar_gps_state_on).setVisible(false);
        }
    }


    public void goToActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

}