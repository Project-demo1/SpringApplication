package com.example.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university")
public class Course {
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name,String totalColleges) {
		super();
		this.id = id;
		this.name = name;
		this.totalColleges =totalColleges;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "universityname")
	private String name;
	
	private String totalColleges;
	
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
	public String getTotalColleges() {
		return name;
	}
	public void setTotalColleges(String totalColleges) {
		this.totalColleges = totalColleges;
	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ",totalColleges=" + totalColleges +"]";
	}
	
	

}
