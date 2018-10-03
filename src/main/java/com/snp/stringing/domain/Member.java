package com.snp.stringing.domain;

public class Member extends Person {

	private int memberId;

	@Override
	public String toString() {
		return "Member{" + "memberId=" + memberId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + '}';
	}

}
