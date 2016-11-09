package com.example.syedinkisarahmed.databasewithfragment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Syed Bakhtiyar on 11/8/2016.
 */
public class DataBaseConnection extends SQLiteOpenHelper {

    Context cont;
    ContentValues values;
    SQLiteDatabase db;

    ArrayList<Record> record;
    Cursor c;



    public String createTable = "CREATE TABLE "+NameRoll.TABLE_NAME+" ("+NameRoll.Students._ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NameRoll.Students.NAME+" TEXT, "+NameRoll.Students.ROLL+" INTEGER)";
    public String dropTable = "DROP TABLE IF EXISTS "+NameRoll.TABLE_NAME;



    public DataBaseConnection(Context context) {
        super(context, NameRoll.DB_NAME, null, NameRoll.VERSION);
        cont = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dropTable);
        onCreate(db);
    }

    public boolean insertData(String name, int roll){
        values = new ContentValues();
        db = this.getWritableDatabase();
        values.put(NameRoll.Students.NAME,name);
        values.put(NameRoll.Students.ROLL,roll);

        long flag = db.insert(NameRoll.TABLE_NAME,null,values);

        if(flag==-1){
            return false;

        }

        return true;
    }

public ArrayList<Record> readData(){
    record = new ArrayList<>();
    db = this.getReadableDatabase();
    c= db.rawQuery("SELECT * FROM "+NameRoll.TABLE_NAME,null);
    String name ;
    int roll;

    while (c.moveToNext()){
        name = c.getString(c.getColumnIndex(NameRoll.Students.NAME));
        roll = c.getInt(c.getColumnIndex(NameRoll.Students.ROLL));
        record .add(new Record(name,roll));




    }
    c.close();
    return record;

}


}
