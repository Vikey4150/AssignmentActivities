package week3.day2;

public class College extends University {
	
	public void ug() {
		System.out.println("Bachelor");
	}
	

	public static void main(String[] args) {
		
		College learn = new College();
		
		learn.ug();
		learn.pg();
		
	}

	
}
