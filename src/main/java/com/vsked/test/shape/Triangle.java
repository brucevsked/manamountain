package com.vsked.test.shape;

public class Triangle extends Shape{
	
	public void draw() {
		System.out.println("this is trangle draw");
	}
	
	public static void main(String[] args) {
		Shape triangle=new Triangle();
		triangle.draw();
		triangle.move();
	}

}
