package com.parceltracker;

public class ParcelStage {

	String stageName;
	ParcelStage next;
	
	ParcelStage(String stageName){
		this.stageName = stageName;
		this.next = null;
	}
	
}
