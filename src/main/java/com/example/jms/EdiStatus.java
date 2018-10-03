package com.example.jms;

import java.util.Date;

public class EdiStatus {
	
	private String id;
	private String status;
	private String description;
	private Date eventDate;
	private String cusDunsNumber;
	private String scac;
	private String proNumber;
	private String sid;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}
	/**
	 * @return the cusDunsNumber
	 */
	public String getCusDunsNumber() {
		return cusDunsNumber;
	}
	/**
	 * @return the scac
	 */
	public String getScac() {
		return scac;
	}
	/**
	 * @return the proNumber
	 */
	public String getProNumber() {
		return proNumber;
	}
	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @param cusDunsNumber the cusDunsNumber to set
	 */
	public void setCusDunsNumber(String cusDunsNumber) {
		this.cusDunsNumber = cusDunsNumber;
	}
	/**
	 * @param scac the scac to set
	 */
	public void setScac(String scac) {
		this.scac = scac;
	}
	/**
	 * @param proNumber the proNumber to set
	 */
	public void setProNumber(String proNumber) {
		this.proNumber = proNumber;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}
	
}
