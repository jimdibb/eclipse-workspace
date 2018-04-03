package com.example.pkg;

import java.util.Map;
import java.util.Set;

public class animal {
	private size Size;
	private String name;
	private color Color;
	private String validator;

	private  Set<String> Names;
	private  Map<Integer, String> MapNames;
	
	public Map<Integer, String> getMapNames() {
		return MapNames;
	}
	public void setMapNames(Map<Integer, String> mapNames) {
		MapNames = mapNames;
	}
	public animal(size Size, String name, color c) {
		this.Size = Size;
		this.name = name;
		this.Color = c; 
		
	}
	public animal(size Size, color c) {
		System.out.println("Called Size, Color constructor");
		this.Size = Size;
		this.Color = c; 
		
	}
	
	public Set<String> getNames() {
		return Names;
	}
	public void setNames(Set<String> names) {
		Names = names;
	}
	public animal() {}
	
	public String getValidator() {
		return validator;
	}
	public void setValidator(String validator) {
		this.validator = validator;
	}
	public void setSize(size Size) {
		this.Size = Size;
	}
	public size getSize() {
		return Size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public color getColor() {
		return Color;
	}

	public void setColor(color theColor) {
		this.Color = theColor;
	}



}
