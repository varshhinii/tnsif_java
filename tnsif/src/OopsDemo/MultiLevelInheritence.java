package OopsDemo;


class Device {// super class
	void deviceType() {
		System.out.println("I am a Electronic gadget");
	}
}
	
class  Phone extends Device{
	void brand() {
		System.out.println("brand:samsung");
	}
}
class SmartPhone extends Phone {
	void features() {
		System.out.println("Features: TouchScreen, Camera,Microphone");
	}
}
	
public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.deviceType();
		phone.brand();
		phone.features();

	}

}


