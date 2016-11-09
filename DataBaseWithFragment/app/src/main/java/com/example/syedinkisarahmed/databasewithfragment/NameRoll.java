package com.example.syedinkisarahmed.databasewithfragment;

import android.provider.BaseColumns;

/**
 * Created by Syed Bakhtiyar on 11/8/2016.
 */
public class NameRoll {
    public static final String DB_NAME ="Student.db";
    public static final String TABLE_NAME = "Record";
    public static final int VERSION = 1;
    public static final class Students implements BaseColumns{
        public static final String _ID ="_ID";
        public static final String NAME = "NAME";
        public static final String ROLL = "Roll";

    }

}
