package com.skynox.whereyou.app.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.skynox.whereyou.app.Config;
import com.skynox.whereyou.app.R;
import com.skynox.whereyou.app.adapters.PeopleListViewAdapter;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class PeopleActivity extends AbstractDefaultActivity {

    private final int LAYOUT = R.layout.activity_people;
    private final String TAG = "PeopleActivity";
    private ListView listViewPeople;
    private PeopleListViewAdapter listViewAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar(LAYOUT);
        initNavigationView();
    }


    private void initPeopleList(View view) {
        listViewPeople = (ListView) view.findViewById(R.id.list_view_people);
        updateListViewPeople();
    }


    private void updateListViewPeople() {
        listViewAdapter = new PeopleListViewAdapter(getApplicationContext(), Config.PEOPLE_LIST);
        listViewPeople.setAdapter(listViewAdapter);
    }

}