package com.kmstudio.tconmap.model;

import java.util.Date;

public class Cyclone {
	public static final String BASIN_NW_PACIFIC = "WP";
	public static final String BASIN_NE_PACIFIC = "EP";

	private String id;  // 4-digit year + jtwc tropical cyclone code (e.g. 201306W)
	private String basin;
	private String nameEn;
	private String nameTc;
	private int year;
	private String code;  // jtwc tropical cyclone code (e.g. 06W)
	private boolean active;
	private Date createDt;
	private Date lastUpdateDt;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBasin() {
		return basin;
	}
	public void setBasin(String basin) {
		this.basin = basin;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getNameTc() {
		return nameTc;
	}
	public void setNameTc(String nameTc) {
		this.nameTc = nameTc;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public Date getLastUpdateDt() {
		return lastUpdateDt;
	}
	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}
}
