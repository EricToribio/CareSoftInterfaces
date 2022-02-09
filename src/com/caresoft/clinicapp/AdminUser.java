package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{
	
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
	public AdminUser(int id, String role) {
		super(id);
		this.securityIncidents = new ArrayList<String>();
		this.employeeID = id;
		this.role = role;
	}
		// TODO Auto-generated constructor stub
	
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}

	
    
}
