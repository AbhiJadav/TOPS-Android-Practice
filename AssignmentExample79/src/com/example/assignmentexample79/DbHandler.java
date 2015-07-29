package com.example.assignmentexample79;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHandler extends SQLiteOpenHelper {

	static String DBNAME="test";
	String TABLENAME="data";
	String KEYID="keyid";
	String KEYNAME="name";
	String KEYEMAIL="email";
	String KEYPHONE="phone";
	String KEYADD="adderess";
	static int VERSION=1;
	public DbHandler(Context context)
	{
		super(context, DBNAME,null,VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String SQL="CREATE TABLE "+TABLENAME+"("+KEYID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+KEYNAME+" TEXT,"+KEYEMAIL+" TEXT,"+KEYPHONE+" TEXT,"+KEYADD+" TEXT)";
		db.execSQL(SQL);
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
void insertdata(User user)
{
	SQLiteDatabase db=getWritableDatabase();
	ContentValues contentValues=new ContentValues();
	contentValues.put(KEYNAME, user.getName());
	contentValues.put(KEYEMAIL, user.getEmail());
	contentValues.put(KEYPHONE,user.getPhone());
	contentValues.put(KEYADD, user.getAdd());
	db.insert(TABLENAME, KEYID, contentValues);
	db.close();
}
List<User>show()
{
	List<User>list=new ArrayList<User>();
	
	SQLiteDatabase db=getReadableDatabase();
	String query="select * from "+TABLENAME+"";
	Cursor c=db.rawQuery(query, null);
	while(c.moveToNext())
	{
		User user=new User();
		user.setId(c.getInt(0));
		user.setName(c.getString(1));
		user.setEmail(c.getString(2));
		user.setPhone(c.getString(3));
		user.setAdd(c.getString(4));
		list.add(user);
	}
	c.close();
	db.close();
	return list;
	
}
void update(User user)
{
	SQLiteDatabase db=getWritableDatabase();
	int id=user.getId();
	ContentValues values=new ContentValues();
	values.put(KEYNAME, user.getName());
	values.put(KEYEMAIL, user.getEmail());
	values.put(KEYPHONE, user.getPhone());
	values.put(KEYADD, user.getAdd());
	String whereClause=""+KEYID+"="+id+"";
	db.update(TABLENAME, values, whereClause, null);
	db.close();
}
void delete(User user)
{
	SQLiteDatabase db=getWritableDatabase();
	int id=user.getId(); 
	String whereClause=""+KEYID+"="+id+"";
	db.delete(TABLENAME, whereClause, null);
	db.close();
}
}
