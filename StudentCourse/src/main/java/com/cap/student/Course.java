package com.cap.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COURSE_ID")
	private int course_id;
	@Column(name="COURSE_NAME")
	private String courseName;
	//@Column(name="")
	

}
