package com.email.email_validator;

public class email_validator {
	public boolean email_validator(String email) {
		//if the email matches any of these criteria, it will return true
		if (email.matches("[^@]*@[^@]*") && email.matches(".*[.].*")) {
			return true;
		}
		//false if not true
		else {
			return false;
		}
	}//end of boolean
}//end of class
