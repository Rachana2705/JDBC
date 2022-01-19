package com.xworkz.newspaper;


import com.xworkz.newspaper.dao.CompanyDAO;
import com.xworkz.newspaper.dao.CompanyDAOImpl;

public class CompanyStarter {

	public static void main(String[] args) {
		CompanyDAO company = new CompanyDAOImpl();
		company.insertCompanyDetails();
		company.updateCompanyDetails();
		company.deleteCompanyDetails();
		company.DisplaySingleCompanyDetail();
		company.DisplayAllCompanyDetails();
	}

}
