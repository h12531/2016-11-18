package edu.tsinghua.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;



public class District implements Serializable{
	
	private int districtId;
	
	private String districtName;
	Set<Street> streets=new HashSet<Street>();
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public District() {
		super();
	}
	public District(int districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}
	public District(int districtId) {
		super();
		this.districtId = districtId;
	}
	public Set<Street> getStreets() {
		return streets;
	}
	public void setStreets(Set<Street> streets) {
		this.streets = streets;
	}
	public District(Set<Street> streets) {
		super();
		this.streets = streets;
	}
	public District(int districtId, String districtName, Set<Street> streets) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.streets = streets;
	}
	public District(String districtName) {
		super();
		this.districtName = districtName;
	}
	

}
