package com.email_password_creater_ShowEmploye_detailes;

import com.email_password_creater_Employ_model.EmployDetailes;

public interface CreateEmployeCard {
	String generateEmailId(String firstname, String lastname,String dept);
	String generatePassword();
	void showDetails(EmployDetailes e1);

}
