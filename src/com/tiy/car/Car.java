package com.tiy.car;

public class Car extends Vehicle {
	
	public String make = null;
	public String model = null;
	public String color = null;
	public int year = 0;
	public int doors = 0;
	
	

	public Car(String make, String model, String color, int year, int doors) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.doors = doors;
		
		
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub

	}

}
