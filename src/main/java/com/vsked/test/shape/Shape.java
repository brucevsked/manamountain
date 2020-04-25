package com.vsked.test.shape;

import java.awt.Color;

public class Shape {
	
	private Color color;
	
	public void draw() {
		System.out.println("this is shape draw");
	}
	
	public void earse() {
		System.out.println("this is shape earse");
	}
	
	public void move() {
		System.out.println("this is shape move");
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color=color;
	}

}
