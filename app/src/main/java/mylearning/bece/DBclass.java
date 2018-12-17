package mylearning.bece;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DBclass {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DatabaDBse";
    private static final String DATABASE_TABLE = "DatabaTable";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_USNAME = "usname";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_SEC = "sec";
    private final Context ourContext;
    private DBHelper ourHelper;
    private SQLiteDatabase ourDatabase;
    public DBclass(Context context) {
        ourContext = context;
    }
    private class DBHelper extends SQLiteOpenHelper {
        public DBHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS" +DATABASE_TABLE);
            onCreate(db);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String sqlCode = "CREATE TABLE " + DATABASE_TABLE + " ( " +
                    KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_NAME + " TEXT NOT NULL, " +
                    KEY_USNAME + " TEXT NOT NULL, " +
                    KEY_EMAIL + " TEXT NOT NULL, " +
                    KEY_SEC + " TEXT NOT NULL);";
            db.execSQL(sqlCode);
        }
    }
    public long insertContact(String name,String usname,String email,String sec) {
        ourHelper =new DBHelper(ourContext);
        ourDatabase=ourHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_USNAME, usname);
        values.put(KEY_EMAIL, email);
        values.put(KEY_SEC,sec);
        return ourDatabase.insert(DATABASE_TABLE, null, values);
    }
    public String searchPass(String name) {
        ourHelper =new DBHelper(ourContext);
        ourDatabase=ourHelper.getReadableDatabase();
        String query = "select name, pass from "+DATABASE_TABLE;
        Cursor cursor = ourDatabase.rawQuery(query, null);
        String a, b;
        b = "not found";
        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);
                if (a.equals(name)) {
                    b = cursor.getString(1);
                    break;
                }
            } while (cursor.moveToNext());
        }
        return b;
    }
    public DBclass open() throws SQLException {
        ourHelper =new DBHelper(ourContext);
        ourDatabase=ourHelper.getWritableDatabase();
        return this;
    }
    public void close(){
        ourHelper.close();;
    }
    public String getName(){
        String[] columns=new String[] {KEY_ID,KEY_USNAME,KEY_NAME,KEY_EMAIL,KEY_SEC};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null,null);
        String result="";
        int iName=c.getColumnIndex(KEY_NAME);
        int iUsname=c.getColumnIndex(KEY_USNAME);
        int iEmail=c.getColumnIndex(KEY_EMAIL);
        int isec=c.getColumnIndex(KEY_SEC);
        for (c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=c.getString(iName);
        }
        c.close();
        return result;
    }
    public String getUsName(){
        String[] columns=new String[] {KEY_ID,KEY_USNAME,KEY_NAME,KEY_EMAIL,KEY_SEC};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null,null);
        String result="";
        int iName=c.getColumnIndex(KEY_NAME);
        int iUsname=c.getColumnIndex(KEY_USNAME);
        int iEmail=c.getColumnIndex(KEY_EMAIL);
        int isec=c.getColumnIndex(KEY_SEC);
        for (c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=c.getString(iUsname);
        }
        c.close();
        return result;
    }
    public String getdata(){
        String[] columns=new String[] {KEY_ID,KEY_USNAME,KEY_NAME,KEY_EMAIL,KEY_SEC};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null,null);
        String result="";
        int iName=c.getColumnIndex(KEY_NAME);
        int iUsname=c.getColumnIndex(KEY_USNAME);
        int iEmail=c.getColumnIndex(KEY_EMAIL);
        int isec=c.getColumnIndex(KEY_SEC);
        for (c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=c.getString(iEmail);
        }
        c.close();
        return result;
    }
    public String getyas(){
        String[] columns=new String[] {KEY_ID,KEY_USNAME,KEY_NAME,KEY_EMAIL,KEY_SEC};
        Cursor c=ourDatabase.query(DATABASE_TABLE,columns,null,null,null,null,null,null);
        String result="";
        int iName=c.getColumnIndex(KEY_NAME);
        int iUsname=c.getColumnIndex(KEY_USNAME);
        int iEmail=c.getColumnIndex(KEY_EMAIL);
        int isec=c.getColumnIndex(KEY_SEC);
        for (c.moveToFirst();!c.isAfterLast();c.moveToNext())
        {
            result=c.getString(isec);
        }
        c.close();
        return result;
    }
    public long update(String name,String lname,String email,String sec) {
        ourHelper = new DBHelper(ourContext);
        ourDatabase = ourHelper.getWritableDatabase();
        String query = "select name, email, usname, sec from " + DATABASE_TABLE;
        Cursor cursor = ourDatabase.rawQuery(query, null);
        String a;
        int b = 1;
        ContentValues values = new ContentValues();
        if (cursor.moveToFirst()) {
            do {
                values.put(KEY_ID,b);
                values.put(KEY_NAME, name);
                values.put(KEY_EMAIL, email);
                values.put(KEY_USNAME, lname);
                values.put(KEY_SEC,sec);
                ourDatabase.update(DATABASE_TABLE, values, KEY_ID + "=?", new String[]{String.valueOf(b)});
            } while (cursor.moveToNext());
        }
     /*   cursor.moveToFirst();
        values.put(KEY_ID, 1);
        values.put(KEY_NAME, cursor.getString(1));
        values.put(KEY_EMAIL, cursor.getString(2));
        values.put(KEY_USNAME, cursor.getString(3));
        values.put(KEY_PASS, cursor.getString(4));
        values.put(KEY_TIME, cursor.getString(5));
   */     return ourDatabase.update(DATABASE_TABLE, values,KEY_ID+"=?", new String[]{String.valueOf(b)});
    }
    public long deleteEntry(String rowId){
        ourHelper =new DBHelper(ourContext);
        ourDatabase=ourHelper.getReadableDatabase();
        String query = "select id,email from "+DATABASE_TABLE;
        Cursor cursor = ourDatabase.rawQuery(query, null);
        String a, b,c;
        b = "not found";
        if (cursor.moveToFirst()) {
            do {
                a = cursor.getString(1);
                if (a.equals(rowId)) {
                    b = cursor.getString(0);
                    break;
                }
            } while (cursor.moveToNext());
        }
        return ourDatabase.delete(DATABASE_TABLE, KEY_ID + "=?", new String[]{b});
    }
}
