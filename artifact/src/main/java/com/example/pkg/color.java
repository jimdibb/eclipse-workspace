package com.example.pkg;

public class color {
	private String ColorName;
	private int index;
	
	public void setColor(String colorName) {
		this.ColorName = colorName;
	}
	public String getColorName() {
		return this.ColorName;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public color(String colorName, int index) {
		this.ColorName = colorName;
		this.index = index;
	}
}
