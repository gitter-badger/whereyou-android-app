package com.skynox.whereyou.app.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.skynox.whereyou.app.R;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class MapActivity extends AbstractDefaultActivity implements OnMapReadyCallback {

    private int layout = R.layout.activity_map;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapView);
        if (mapFragment!=null && !mapFragment.isVisible() && !mapFragment.isAdded())
        setContentView(layout);
        initToolbar();
        initNavigationView();
    }

    @Override
    public void onMapReady(final GoogleMap map) {

    }
}