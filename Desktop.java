package week3.day2;

public class Desktop implements HardWare , SoftWare {

	public void softwareResources() {
		
		System.out.println("SoftWare");
		
	}

	public void hardwareResources() {

		System.out.println("HardWare");
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.hardwareResources();
		desk.softwareResources();
	}

}
