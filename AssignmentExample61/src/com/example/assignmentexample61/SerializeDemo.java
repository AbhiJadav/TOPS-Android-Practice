package com.example.assignmentexample61;

import java.io.Serializable;

public class SerializeDemo implements Serializable {
public SerializeDemo(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

String name,pass;

public SerializeDemo() {
	super();
	// TODO Auto-generated constructor stub
}

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
	
}
