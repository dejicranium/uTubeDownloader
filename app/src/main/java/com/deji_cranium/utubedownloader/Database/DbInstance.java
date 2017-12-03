package com.deji_cranium.utubedownloader.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLTimeoutException;

/**
 * Created by cranium on 12/1/17.
 */

public class DbInstance {
    private static DBHelper dbHelper;
    private static final SQLiteDatabase readableDatabase = dbHelper.getReadableDatabase();
    private static final SQLiteDatabase writableDatabase = dbHelper.getWritableDatabase();


    public static SQLiteDatabase getReadableDatabase(Context context){
        dbHelper = new DBHelper(context);
        return readableDatabase;
    }

    public static SQLiteDatabase getWritableDatabase(Context context){
        dbHelper = new DBHelper(context);
        return writableDatabase;
    }


}
