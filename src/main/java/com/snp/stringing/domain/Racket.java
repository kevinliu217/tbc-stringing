package com.snp.stringing.domain;

import java.util.List;

public class Racket {

	private String brand;
	private String model;
	private double tesnsion;
	private Member owner;
	private List<Stringing> stringHistory;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getTesnsion() {
		return tesnsion;
	}

	public void setTesnsion(double tesnsion) {
		this.tesnsion = tesnsion;
	}

	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}

	public List<Stringing> getStringHistory() {
		return stringHistory;
	}

	public void setStringHistory(List<Stringing> stringHistory) {
		this.stringHistory = stringHistory;
	}
}
