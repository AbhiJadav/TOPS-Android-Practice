package com.example.assignmentexample82;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DbHandler extends SQLiteOpenHelper {

	static String DBNAME="TEST";
	String TABLENAME="DATA";
	String KEYID="keyid";
	String KEYNAME="keyname";
	String KEYEMAIL="keyemail";
	static int VERSOIN=1;
	Context context;
	public DbHandler(Context context) {
		super(context, DBNAME, null, VERSOIN);
		this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql="create table "+TABLENAME+"("+KEYID+" integer primary key autoincrement,"+KEYNAME+" text,"+KEYEMAIL+" text)";
		db.execSQL(sql);
		Toast.makeText(context, "Database Created", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	void insertdata(User user)
	{
		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		
		values.put(KEYNAME, user.getName());
		values.put(KEYEMAIL, user.getEmail());
		db.insert(TABLENAME, KEYID, values);
		db.close();
	}
	List<User>show()
	{
		List<User>list=new ArrayList<User>();
		User user=new User();
		SQLiteDatabase db=getReadableDatabase();
		String query="select * from "+TABLENAME+"";
		Cursor c=db.rawQuery(query, null);
				while(c.moveToNext())
				{
					user.setId(c.getInt(0));
					user.setName(c.getString(1));
					user.setEmail(c.getString(2));
					list.add(user);
					
				}
				c.close();
				db.close();
		return list;
		
	}
	void update(User user)
	{
		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		
		values.put(KEYNAME, user.getName());
		values.put(KEYEMAIL, user.getEmail());
		int id=user.getId();
		String whereClause=""+KEYID+"="+id+"";
		db.update(TABLENAME, values, whereClause, null);
		db.close();
		
	}
	void deletedata(User user)
	{

		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		int id=user.getId();
		String whereClause=KEYID +"="+ id; 
		db.delete(TABLENAME, whereClause, null);
		db.close();
	}
}
