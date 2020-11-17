package com.qa.community.solid.interfaceseg;

public class Dodo implements ExtinctCreature, EggLayingCreature{

	private String currentLocation;
	private int numberOfEggs;
	
	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		
	}

	
	public void goExtinct() {
		// TODO Auto-generated method stub
		
	}
	
}
