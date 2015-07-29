package com.example.assignmentexample83;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DbHandler extends SQLiteOpenHelper {

	static String DBName="Database";
	String TABLENAME="userdata";
	String KEYID="keyid";
	String NAME="username";
	String PASS="pass";
	static int VERSION=1;
	Context context;
	public DbHandler(Context context) {
		super(context, DBName, null, VERSION);
		this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql="create table "+TABLENAME+"("+KEYID+" integer primary key autoincrement,"+NAME+" text,"+PASS+" text)";
		db.execSQL(sql);
		Toast.makeText(context, db.getPath(), Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	void insertdata(User user)
	{
		SQLiteDatabase db=getWritableDatabase();
	ContentValues values=new ContentValues();
	values.put(NAME, user.getUnaame());
	values.put(PASS, user.getUpass());
	db.insert(TABLENAME, KEYID, values);
	Toast.makeText(context, db.getPath(), Toast.LENGTH_SHORT).show();
		
	}

}
