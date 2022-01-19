package com.xworkz.newspaper;

import com.xworkz.newspaper.dao.AirportDAO;
import com.xworkz.newspaper.dao.AirportDAOImpl;

public class AirportStater {

	public static void main(String[] args) {

		AirportDAO airport1 = new AirportDAOImpl();
		airport1.insertAirportDetails();
		airport1.updateAirportDetails();
		airport1.deleteAirportDetails();
		airport1.DisplaySingleAirportDetail();
		airport1.DisplayAllAirportDetails();
	}

}
