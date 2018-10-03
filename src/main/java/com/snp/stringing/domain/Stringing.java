package com.snp.stringing.domain;

import java.sql.Date;

public class Stringing {

	private Brand brand;
	private StringType stringType;
	private double tension;
	private Stringer stringer;
	private Date checkInDate;
	private Date checkOutDate;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public StringType getStringType() {
		return stringType;
	}

	public void setStringType(StringType stringType) {
		this.stringType = stringType;
	}

	public double getTension() {
		return tension;
	}

	public void setTension(double tension) {
		this.tension = tension;
	}

	public Stringer getStringer() {
		return stringer;
	}

	public void setStringer(Stringer stringer) {
		this.stringer = stringer;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
}
