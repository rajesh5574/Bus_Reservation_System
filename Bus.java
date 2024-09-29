package com.busreservation;

public class Bus {

	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int busNo,boolean ac,int cap){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public void setBusNo(int BusNo) {
		busNo=BusNo;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public void setAc(boolean val) {
		ac=val;
	}
	
}
