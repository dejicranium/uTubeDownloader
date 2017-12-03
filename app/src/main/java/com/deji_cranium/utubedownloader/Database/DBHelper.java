package com.deji_cranium.utubedownloader.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cranium on 12/1/17.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static int SCHEMA_VERSION = 1;

    private static final String DATABASE_NAME = "UtubeData";
    private static final String DOWNLOADS_TABLE = "DownloadsTable";
    private static final String SEARCH_HISTORY_TABLE = "SearchHistoryTable";


    public static final String FILE_NAME = "file_name";
    public static final String FILE_TYPE = "file_type";
    public static final String DOWNLOADED = "downloaded";
    public static final String DATE_DOWNLOADED = "date_downloaded";
    public static final String LAST_ATTEMPTED = "last_attempted";
    public static final String SIZE = "size";
    public static final String DOWNLOADED_SIZE = "downloaded_size";
    public static final String QUALITY = "quality";
    public static final String DATE_SEARCHED = "date_searched";


    private static final String CREATE_DOWNLOADS_TABLE = "CREATE TABLE "+ DOWNLOADS_TABLE + "(" +
            FILE_NAME + " TEXT,"+
            FILE_TYPE + " TEXT," +
            SIZE  + " TEXT," +
            DOWNLOADED_SIZE + " TEXT,"+
            DATE_DOWNLOADED + " TEXT" +
            DOWNLOADED + " TEXT," +
            LAST_ATTEMPTED + " TEXT,"+
            QUALITY + " TEXT)";

    private static final String CREATE_SEARCH_TABLE = "CREATE TABLE "+ SEARCH_HISTORY_TABLE +"("+
            FILE_NAME + " TEXT," +
            DATE_SEARCHED + " TEXT)";


    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_DOWNLOADS_TABLE);
        sqLiteDatabase.execSQL(CREATE_SEARCH_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

