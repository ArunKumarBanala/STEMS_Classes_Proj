package com.rsrit.coursemngt.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="session_m")
public class Session {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SESSIONID")
	private int sessionId;
	
	@Column(name="CREATEDON")
	private Timestamp createdOn;
	
	@Column(name="RUNTIME")
	private double runTime;
	
	@Column(name="ATTENDEEIDS")
	private String attendeeIds;
	
	@Column(name="ABSENTEEIDS")
	private String absenteeIds;
	
	@Column(name="ISASSIGNMENTPROVIDED")
	@Type(type= "org.hibernate.type.NumericBooleanType")
	private boolean isAssignmentProvided;
	
	@Column(name="LISTOFTOPICS")
	private String listOfTopics;
	@ManyToOne
	@JoinColumn(name="CLASSID")
	private Classes classes;

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public double getRunTime() {
		return runTime;
	}

	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}

	public String getAttendeeIds() {
		return attendeeIds;
	}

	public void setAttendeeIds(String attendeeIds) {
		this.attendeeIds = attendeeIds;
	}

	public String getAbsenteeIds() {
		return absenteeIds;
	}

	public void setAbsenteeIds(String absenteeIds) {
		this.absenteeIds = absenteeIds;
	}

	public boolean isAssignmentProvided() {
		return isAssignmentProvided;
	}

	public void setAssignmentProvided(boolean isAssignmentProvided) {
		this.isAssignmentProvided = isAssignmentProvided;
	}

	public String getListOfTopics() {
		return listOfTopics;
	}

	public void setListOfTopics(String listOfTopics) {
		this.listOfTopics = listOfTopics;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", createdOn=" + createdOn + ", runTime=" + runTime
				+ ", attendeeIds=" + attendeeIds + ", absenteeIds=" + absenteeIds + ", isAssignmentProvided="
				+ isAssignmentProvided + ", listOfTopics=" + listOfTopics + ", classes=" + classes + "]";
	}

}
