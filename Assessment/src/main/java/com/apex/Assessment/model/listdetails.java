package com.apex.Assessment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ListDT")

public class listdetails {
	
@Id
	
private String SecurityID;
	
private long CurrentPosition;
	
private double CurrentPrice;

public String getSecurityID() {
	return SecurityID;
}

public void setSecurityID(String securityID) {
	SecurityID = securityID;
}

public long getCurrentPosition() {
	return CurrentPosition;
}

public void setCurrentPosition(long currentPosition) {
	CurrentPosition = currentPosition;
}

public double getCurrentPrice() {
	return CurrentPrice;
}

public void setCurrentPrice(double currentPrice) {
	CurrentPrice = currentPrice;
}

@Override
public String toString() {
	return "listdetails [SecurityID=" + SecurityID + ", CurrentPosition=" + CurrentPosition + ", CurrentPrice="
			+ CurrentPrice + "]";
}



}
