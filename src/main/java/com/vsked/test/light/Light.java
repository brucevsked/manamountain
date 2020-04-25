package com.vsked.test.light;

/**
 * java编程思想
 * @author vsked
 *
 */
public class Light {
	
	public void on() {
		System.out.println("on");
	}
	
	public void off() {
		System.out.println("off");
	}
	
	public void brighten() {
		System.out.println("brighten");
	}
	
	public void dim() {
		System.out.println("dim");
	}
	
	public static void main(String[] args) {
		Light light=new Light();
		light.on();
		light.brighten();
		light.dim();
		light.off();
	}

}
