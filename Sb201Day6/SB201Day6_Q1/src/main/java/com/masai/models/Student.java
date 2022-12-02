package com.masai.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRoll;
	private String studentName;
	private String mobile;
	private String email;
	
	@ManyToOne( cascade = CascadeType.ALL)
	private Collage collage;

	public Student(int studentRoll, String studentName, String mobile, String email, Collage collage) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobile = mobile;
		this.email = email;
		this.collage = collage;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collage == null) ? 0 : collage.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentRoll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (collage == null) {
			if (other.collage != null)
				return false;
		} else if (!collage.equals(other.collage))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentRoll != other.studentRoll)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobile=" + mobile
				+ ", email=" + email + ", collage=" + collage + "]";
	}
	
	
}
