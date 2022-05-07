package org.opentutorials.iot;

import java.util.Random;

public class Lighting1 implements OnOff1{
	String _id;
	public Lighting1(String id){
		this._id = id;
	}
	public boolean on() {
		System.out.println(this._id + " -> Lighting on");
		return true;
	}
	public boolean off() {
		System.out.println(this._id + " -> Lighting off");
		return true;
	}
	public Boolean isOn() {
		Random rand = new Random();
		return rand.nextBoolean();
	}
	
}