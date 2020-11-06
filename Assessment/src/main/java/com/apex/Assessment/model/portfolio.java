package com.apex.Assessment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "portfolio")

public class portfolio {
	
	@Id
	private String SecurityID;
	
	private String PortfolioName;
	
	private String Side;
	
	private int AccountName;
	
	private long SODPosition;
	
	private long PositionFilled;
	
	private long CurrentPosition;
	
	private double ClosePrice;
	
	private double CurrentPrice;
	
	private double PriceChange;
	
	private double AverageFillPrice;
	
	private double SODPL;
	
	private double TradePL;
	
	private double TotalPL;

	public String getSecurityID() {
		return SecurityID;
	}

	public void setSecurityID(String securityID) {
		SecurityID = securityID;
	}

	public String getPortfolioName() {
		return PortfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		PortfolioName = portfolioName;
	}

	public String getSide() {
		return Side;
	}

	public void setSide(String side) {
		Side = side;
	}

	public int getAccountName() {
		return AccountName;
	}

	public void setAccountName(int accountName) {
		AccountName = accountName;
	}

	public long getSODPosition() {
		return SODPosition;
	}

	public void setSODPosition(long sODPosition) {
		SODPosition = sODPosition;
	}

	public long getPositionFilled() {
		return PositionFilled;
	}

	public void setPositionFilled(long positionFilled) {
		PositionFilled = positionFilled;
	}

	public long getCurrentPosition() {
		return CurrentPosition;
	}

	public void setCurrentPosition(long currentPosition) {
		CurrentPosition = currentPosition;
	}

	public double getClosePrice() {
		return ClosePrice;
	}

	public void setClosePrice(double closePrice) {
		ClosePrice = closePrice;
	}

	public double getCurrentPrice() {
		return CurrentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		CurrentPrice = currentPrice;
	}

	public double getPriceChange() {
		return PriceChange;
	}

	public void setPriceChange(double priceChange) {
		PriceChange = priceChange;
	}

	public double getAverageFillPrice() {
		return AverageFillPrice;
	}

	public void setAverageFillPrice(double averageFillPrice) {
		AverageFillPrice = averageFillPrice;
	}

	public double getSODPL() {
		return SODPL;
	}

	public void setSODPL(double sODPL) {
		SODPL = sODPL;
	}

	public double getTradePL() {
		return TradePL;
	}

	public void setTradePL(double tradePL) {
		TradePL = tradePL;
	}

	public double getTotalPL() {
		return TotalPL;
	}

	public void setTotalPL(double totalPL) {
		TotalPL = totalPL;
	}

	@Override
	public String toString() {
		return "portfolio [SecurityID=" + SecurityID + ", PortfolioName=" + PortfolioName + ", Side=" + Side
				+ ", AccountName=" + AccountName + ", SODPosition=" + SODPosition + ", PositionFilled=" + PositionFilled
				+ ", CurrentPosition=" + CurrentPosition + ", ClosePrice=" + ClosePrice + ", CurrentPrice="
				+ CurrentPrice + ", PriceChange=" + PriceChange + ", AverageFillPrice=" + AverageFillPrice + ", SODPL="
				+ SODPL + ", TradePL=" + TradePL + ", TotalPL=" + TotalPL + "]";
	}
	
	

}
