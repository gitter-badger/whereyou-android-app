package com.skynox.whereyou.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.skynox.whereyou.app.R;
import com.skynox.whereyou.app.model.PeopleModel;

import java.util.ArrayList;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

public class PeopleListViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private ArrayList<PeopleModel> peopleData;

    public PeopleListViewAdapter(Context con, ArrayList<PeopleModel> peo) {
        context = con;
        peopleData = peo;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private class ViewHolder {
        public ImageView people_photo;
        public TextView people_name;
        public TextView people_phone;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        View view = inflater.inflate(R.layout.listview_item_people, parent, false);
        PeopleModel people = getItem(position);

        holder.people_name = (TextView) view.findViewById(R.id.listview_item_people_name);
        holder.people_phone = (TextView) view.findViewById(R.id.listview_item_people_phone);
        holder.people_photo = (ImageView) view.findViewById(R.id.listview_item_people_photo);
        holder.people_name.setText(people.name);
        holder.people_phone.setText(people.phone);
        if (people.photo != null)
            holder.people_photo.setImageURI(people.photo);

        view.setTag(holder);

        return view;
    }


    @Override
    public PeopleModel getItem(int position) {
        return peopleData.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getCount() {
        return peopleData.size();
    }

}