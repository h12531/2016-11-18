package edu.tsinghua.entity;

import java.io.Serializable;

public class Street implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int streetId;
	private String streetName;
	private  District dis;
	public int getStreetId() {
		return streetId;
	}
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public District getDis() {
		return dis;
	}
	public void setDis(District dis) {
		this.dis = dis;
	}
	public Street(int streetId, String streetName, District dis) {
		super();
		this.streetId = streetId;
		this.streetName = streetName;
		this.dis = dis;
	}
	public Street() {
		super();
	}
	public Street(int streetId, District dis) {
		super();
		this.streetId = streetId;
		this.dis = dis;
	}
	public Street(District dis) {
		super();
		this.dis = dis;
	}
	public Street(int streetId) {
		super();
		this.streetId = streetId;
	}
	public Street(String streetName) {
		super();
		this.streetName = streetName;
	}
	public Street(int streetId, String streetName) {
		super();
		this.streetId = streetId;
		this.streetName = streetName;
	}
	
	
	
	
}
