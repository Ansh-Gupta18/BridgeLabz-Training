package com.parceltracker;

public class ParcelTracker {

	ParcelStage head;
	
	void addStage(String stageName) {
		ParcelStage newStage = new ParcelStage(stageName);
		
		if(head == null ) {
			head =  newStage;
			return;
		}
		ParcelStage temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStage;
	}
	void addCheckPoint(String afterStage, String newStage) {
		ParcelStage temp = head;
		
		while(temp != null && !temp.stageName.equals(afterStage)) {
			temp = temp.next;
		}
		
		if(temp != null) {
			ParcelStage checkpoint = new ParcelStage(newStage);
			checkpoint.next = temp.next;
			temp.next = checkpoint;
		}
		else {
			System.out.println("Stage not found!");
		}
	}
	void trackParcel() {
		ParcelStage temp = head;
		
		if(temp == null) {
			System.out.println("Parcel is lost!");
			return;
		}
		while(temp != null) {
			System.out.print(temp.stageName + "- >");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
}
