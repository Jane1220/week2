/**
 * 
 */
package com.wangxinyu.domain;

import java.util.Date;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
public class Column {
	
	private Integer    id;
	private String     gj;
	private String     ms;
	private String     name;
	private String     brand;
	private String     address;
	private double     price;
	private String       starttime;
	private String       njtime;
	private String     status;
	private String     bz;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGj() {
		return gj;
	}
	public void setGj(String gj) {
		this.gj = gj;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getNjtime() {
		return njtime;
	}
	public void setNjtime(String njtime) {
		this.njtime = njtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public Column() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Column [id=" + id + ", gj=" + gj + ", ms=" + ms + ", name=" + name + ", brand=" + brand + ", address="
				+ address + ", price=" + price + ", starttime=" + starttime + ", njtime=" + njtime + ", status="
				+ status + ", bz=" + bz + "]";
	}
	
	
	

}
