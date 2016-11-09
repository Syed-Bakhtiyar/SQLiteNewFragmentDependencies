package com.example.syedinkisarahmed.databasewithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Syed Bakhtiyar on 11/8/2016.
 */
public class CustomAdapter extends BaseAdapter {

    ArrayList<Record> records;
    Context context;
    LayoutInflater inflater;

    TextView txtName,txtRoll;



    public CustomAdapter(ArrayList<Record> records, Context context) {
        this.records = records;
        this.context = context;
     //   this.inflater.from(context);
    }

    @Override
    public int getCount() {
        return records.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = inflater.from(context).inflate(R.layout.custom_list,parent,false);

        txtName = (TextView) convertView.findViewById(R.id.readName);
        txtRoll = (TextView) convertView.findViewById(R.id.readROll);

        txtName.setText(records.get(position).getName()+"");
        txtRoll.setText(records.get(position).getRoll()+"");



        return convertView;
    }
}
