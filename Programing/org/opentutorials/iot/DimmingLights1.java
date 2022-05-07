package org.opentutorials.iot;

public class DimmingLights1 extends Lighting1 {

	double _bright;
	public DimmingLights1(String _name) {
		super(_name);
		this._bright = 100;
	}
	
	public void setBright(double bright) {
		this._bright = bright;
		System.out.println(this._id + " -> DimmingLights bright : "+bright);
	}

}
