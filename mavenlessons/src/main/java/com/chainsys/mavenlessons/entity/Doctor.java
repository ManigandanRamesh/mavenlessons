package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="Doctor")
public class Doctor {
	 @Id
	    @Column(name = "ID")
	    private int id ;
	 	@Column(name = "NAME")
		private String name; 
	 	@Column(name = "DOB")
		private Date dob ; 
	 	@Column(name ="SPECIALITY")
		private String speciality ;
	 	@Column(name ="CITY")
		private String city; 
	 	@Column(name ="PHONE_NO")
		private long phone_no; 
		@Column(name="Standard_fees")
		private float Standard_fees;
	// Bidirectional Association	
		
	@OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Appointment> appointments;
	public List<Appointment>getAppointments(){
		return this.appointments;
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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}


	public float getStandard_fees() {
		return Standard_fees;
	}


	public void setStandard_fees(float standard_fees) {
		this.Standard_fees = standard_fees;
	}


	  
	    @Override
	    public String toString() {
	        return String.format("%d, %s, %s, %s, %s, %d,%.2f",id,name,dob,speciality,city,phone_no,Standard_fees);
	    }


}

