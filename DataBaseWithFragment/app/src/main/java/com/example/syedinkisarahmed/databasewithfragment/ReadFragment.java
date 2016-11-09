package com.example.syedinkisarahmed.databasewithfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadFragment extends Fragment {

    DataBaseConnection myDb;
    ListView listView;

    CustomAdapter custom;

    public ReadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_read, container, false);

        listView = (ListView) v.findViewById(R.id.list);
        myDb = new DataBaseConnection(v.getContext());
        custom = new CustomAdapter(myDb.readData(),v.getContext());

        listView.setAdapter(custom);

        return v;
    }

}
