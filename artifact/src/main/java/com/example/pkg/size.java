package com.example.pkg;

public class size {
	private double Weight;
	private double Height;
	
	size () {}
	
	size(double height, double weight) {
		this.Weight = weight;
		this.Height = height;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}
	
	
	
}
