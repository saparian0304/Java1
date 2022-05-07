import org.opentutorials.iot.Elevator1;
import org.opentutorials.iot.Lighting1;
import org.opentutorials.iot.Security1;


public class OkJavaGoinHome {

	public static void main(String[] args) {
		
		String id = "Java APT 507";
		
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

	}

}
