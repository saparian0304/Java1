package org.opentutorials.iot;

import java.util.Random;

public class Speaker1 {
	String _id;
	public Speaker1(String id) {
		this._id = id;
	}
	public Boolean makeVoice(String content) {
		System.out.println(this._id + " -> Speaker on : " + content);
		return true;
	}
}