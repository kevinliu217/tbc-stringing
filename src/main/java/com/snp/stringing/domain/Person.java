package com.snp.stringing.domain;

public abstract class Person {

	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + '}';
	}

}
