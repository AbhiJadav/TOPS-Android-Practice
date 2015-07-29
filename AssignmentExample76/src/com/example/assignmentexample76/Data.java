package com.example.assignmentexample76;

import javax.xml.transform.Source;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {

	String name,pass;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Data(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(name);
		dest.writeString(pass);
		
		
	}
private void readfromParcel(Parcel in) {

	name=in.readString();
	pass=in.readString();
}

public Data(Parcel in) {
	
	super();
	readfromParcel(in);
	// TODO Auto-generated constructor stub
}

public Parcelable.Creator<Data> CREATER=new Creator<Data>() {
	
	@Override
	public Data[] newArray(int size) {
		// TODO Auto-generated method stub
		return new Data[size];
	}
	
	@Override
	public Data createFromParcel(Parcel source) {
		// TODO Auto-generated method stub
		return new Data(source);
	}
};
}
