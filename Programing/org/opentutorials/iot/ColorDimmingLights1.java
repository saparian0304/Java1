package org.opentutorials.iot;

import java.awt.Color;

public class ColorDimmingLights1 extends DimmingLights1 {

	double _bright = 0;
	Color _color;
	
	public ColorDimmingLights1(String id) {
		super(id);
		this._color = Color.white;
	}
	
	public void setColor(Color color) {
		this._color = color;
		System.out.println(this._id + " -> ColorDimmingLights color : "+color);
	}

}
