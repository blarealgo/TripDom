package edu.itla.tripdom.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by blare on 26/11/2017.
 */

public class Dbconnection extends SQLiteOpenHelper  {

    public static String DATABASE_NAME = "tripdom.db";
    public static String LOG_T = "Dbconnection";

    public Dbconnection (Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

        @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

sqLiteDatabase.execSQL(SqlHelperSchema.USUARIO_TABLE);
sqLiteDatabase.execSQL(SqlHelperSchema.PUBLICACION);
//TODO: poner las sentencias de las entidades restantes.
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
