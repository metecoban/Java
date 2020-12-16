// A little library program

/* 
 * Created by metecoban 
*/

public class Test {

	public static void main(String[] args) {
		
		// Create an object which name is obj, with constructor
		Encapsulation obj = new Encapsulation("Walden - Ormanda Yasam", "H. David Thoreau", "ZEPLIN", 2014);
		
		// Print all the datas
		System.out.println("Name: " + obj.getName() +
				"\nAuthor's name: " + obj.getAuthor() + 
				"\nPublisher's name: " + obj.getPublisher() + 
				"\nPrinting Press: " + obj.getPrintingPress());
		
		// Update 
		obj.setAuthor("Henry David Thoreau");
		
		// Print all the datas after updating
		System.out.println("\nName: " + obj.getName() + 
				"\nAuthor's name: " + obj.getAuthor() + 
				"\nPublisher's name: " + obj.getPublisher() + 
				"\nPrinting Press: " + obj.getPrintingPress());
		
		// Create an object which name is otherObj, without using constructors
		Encapsulation otherObj = new Encapsulation();
		otherObj.setName("Fahrenheit 451");
		otherObj.setAuthor("Ray Bradbury");
		otherObj.setPublisher("Ithaki Yayinlari");
		otherObj.setPrintingPress(1953);
		
		// Print all the datas
		System.out.println("\nName: " + otherObj.getName() + 
				"\nAuthor's name: " + otherObj.getAuthor() + 
				"\nPublisher's name: " + otherObj.getPublisher() + 
				"\nPrinting Press: " + otherObj.getPrintingPress());
	}

}
