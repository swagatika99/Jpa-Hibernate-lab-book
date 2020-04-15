package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aut_hib")
public class AutEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String firstname;
private String middlename;
private String lastname;
private long phoneno;
public AutEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public AutEntity(String firstname,String middlename,String lastname,long phoneno)
{
	this.firstname=firstname;
	this.middlename=middlename;
	this.lastname=lastname;
	this.phoneno=phoneno;
}
public AutEntity(int id, String firstname, String middlename, String lastname, long phoneno) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.middlename = middlename;
	this.lastname = lastname;
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "AutEntity [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
			+ ", phoneno=" + phoneno + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getMiddlename() {
	return middlename;
}
public void setMiddlename(String middlename) {
	this.middlename = middlename;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

}
