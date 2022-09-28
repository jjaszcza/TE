package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep = false;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public String getSound( ) {

		if (this.asleep)
		return sound;
	}

	public void sleep() {
		isAsleep = true;
	}

	public void wake() {
		isAsleep = false;
	}

}
