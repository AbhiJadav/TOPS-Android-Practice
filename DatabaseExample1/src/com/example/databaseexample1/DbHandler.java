package com.example.databaseexample1;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.app.NavUtils;
import android.util.Log;

public class DbHandler extends SQLiteOpenHelper {

	Context context;
	static String DATABASENAME="test";
	String TABLENAME="userdata";
	static int VERSION=1;
	String NAME="name";
	String PASS="pass";
	String KEYID="keyid";
	public DbHandler(Context context) {
		super(context,DATABASENAME,null,VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String SQL="create table "+TABLENAME+"("+KEYID+" integer primary key autoincrement,"+NAME+" text,"+PASS+" text)";
		db.execSQL(SQL);
		Log.d("my", "Database Created");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	public void insert(User user)
	{
		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		values.put(NAME,user.getName());
		values.put(PASS, user.getPass());
		db.insert(TABLENAME, KEYID, values);
		
	}
	List<User>show()
	{
		List<User>list=new ArrayList<User>();
		SQLiteDatabase db=getReadableDatabase();
		String sql="select * from "+TABLENAME+"";
		Cursor c=db.rawQuery(sql, null);
		while(c.moveToNext())
		{
			User user=new User();
			user.setId(c.getInt(0));
			user.setName(c.getString(1));
			user.setName(c.getString(2));
			list.add(user);
			
		
		}
		c.close();
		db.close();
		return list;
		
	}

}
