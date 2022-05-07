import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights1;
import org.opentutorials.iot.Elevator1;
import org.opentutorials.iot.Lighting1;
import org.opentutorials.iot.Security1;


public class OkJavaGoinHomeinput {
	
	// args : parameter, �Ű�����
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator1 myElevator = new Elevator1(id);
		myElevator.callForUp(1);
		
		// Security off
		Security1 mySecurity = new Security1(id);
		mySecurity.off();
		
		// Light on 
		Lighting1 hallLamp = new Lighting1(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting1 floorLamp = new Lighting1(id+" / floor Lamp");
		floorLamp.on();
		
		DimmingLights1 moodLamp = new DimmingLights1(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
