package com.masai.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	private String collageAddress;
	private String collageName;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Student> al = new ArrayList<Student>();

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collage(int collageId, String collageAddress, String collageName, List<Student> al) {
		super();
		this.collageId = collageId;
		this.collageAddress = collageAddress;
		this.collageName = collageName;
		this.al = al;
	}

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public List<Student> getAl() {
		return al;
	}

	public void setAl(List<Student> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageAddress=" + collageAddress + ", collageName=" + collageName
				+ ", al=" + al + "]";
	}

	
	
	
	
}
