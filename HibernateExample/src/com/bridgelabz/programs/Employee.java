package com.bridgelabz.programs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demo_emp")
public class Employee {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dept")
	private String dept;
	
	/*@Column(name="age")
	private String age;*/
	
	@Column(name="salary")
	private String salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name,String dept,String salary) {
		// TODO Auto-generated constructor stub
		this.dept=dept;
		this.salary=salary;
		this.name=name;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	/*public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}*/
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
