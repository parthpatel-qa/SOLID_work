package com.qa.community.solid.singleresponsibility;

public class Mechanic {

	private boolean addSpoiler;
	private boolean changeTyres;
	
	//constructors
	public Mechanic(boolean addSpoiler, boolean changeTyres) {
		super();
		this.addSpoiler = addSpoiler;
		this.changeTyres = changeTyres;
	}

	public boolean isAddSpoiler() {
		return addSpoiler;
	}

	public void setAddSpoiler(boolean addSpoiler) {
		this.addSpoiler = addSpoiler;
	}

	public boolean isChangeTyres() {
		return changeTyres;
	}

	public void setChangeTyres(boolean changeTyres) {
		this.changeTyres = changeTyres;
	}
	
	//getters and setters
	
	
	
	
}
