package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	@Column(name = "APP_ID")
	private int appid;
	@Column(name = "APP_DATE")
	private Date app_date;
	@Column(name = "ID")
	private int id;
	@Column(name = "PATIENT_NAME")
	private String patient_name;
	@Column(name = "FEES_AMOUNTS")
	private float fees_Amounts;
	@Column(name = "FEES_COLLECTION")
	private String fees_collection;
// @Column(name = "id")
// private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id" , nullable = false, insertable = false , updatable = false)
	@JsonIgnore
	private Doctor doctor;
	public Doctor getDoctor() {  
		return this.doctor;
	}
	public void setDoctor(Doctor doc) {
		this.doctor=doc;
	}
	
    public int getApp_id() {
		return appid;
	}

	public void setApp_id(int app_id) {
		this.appid = app_id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public float getFees_Amounts() {
		return fees_Amounts;
	}

	public void setFees_Amounts(float fees_Amounts) {
		this.fees_Amounts = fees_Amounts;
	}

	public String getFees_collection() {
		return fees_collection;
	}

	public void setFees_collection(String fees_collection) {
		this.fees_collection = fees_collection;
	}
//	public int getDocId() {
//	return docId();
//}
//public void setDocId(int docId) {
//	this.docId = docId;
//}
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %.2f, %s",appid,app_date,patient_name,fees_Amounts,fees_collection);
	}

}
