package com.email.email_validator;

public class email_validator {
	public boolean email_validator(String email) {
		boolean validation = true;
		int count = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@'); {
				count++;
			}
		}
		if (count != 1) {
			validation = false;
		}
		if (!email.contains(".")) {
			validation = false;
		}
		return validation;
	}
}
