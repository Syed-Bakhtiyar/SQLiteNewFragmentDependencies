package com.example.syedinkisarahmed.databasewithfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertFragment extends Fragment {


    TextView txtName, txtRoll;
    DataBaseConnection myDb;

    String name ;
    int roll;
    Button btn;

    public InsertFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_insert, container, false);

        myDb = new DataBaseConnection(v.getContext());
        txtName = (TextView) v.findViewById(R.id.name);
        txtRoll = (TextView) v.findViewById(R.id.roll);
        btn = (Button) v.findViewById(R.id.submit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    name = txtName.getText().toString();
                    roll = Integer.parseInt(txtRoll.getText().toString());
                    if(myDb.insertData(name,roll)){

                        Toast.makeText(v.getContext(), "Inserted", Toast.LENGTH_SHORT).show();


                    }else {
                        Toast.makeText(v.getContext(), "Not Inserted", Toast.LENGTH_SHORT).show();

                    }


                }catch (Exception e){
                    Toast.makeText(v.getContext(), e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });



        return v;
    }

}
