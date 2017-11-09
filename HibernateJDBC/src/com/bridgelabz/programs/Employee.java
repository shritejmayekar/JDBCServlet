package com.bridgelabz.programs;

public class Employee {
private int id;
private String firstName,lastName;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String firstName,String lastName) {
	
	this.firstName=firstName;
	this.lastName=lastName;

}
public int getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public void setId(int id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
