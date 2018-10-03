package com.snp.stringing.domain;

public class Stringer extends Person {
	
	private int stringId;

	@Override
	public String toString() {
		return "Stringer{" + "stringId=" + stringId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + '}';
	}
}
