/* 
 * Created by metecoban 
*/

public class Encapsulation {
	
	private String name;
	private String author;
	private String publisher;
	private int printingPress;

	// Constructors
	public Encapsulation() {

	}
	public Encapsulation(String name, String author, String publisher, int printingPress) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.printingPress = printingPress;
	}
	
	// All get methods
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPrintingPress() {
		return printingPress;
	}

	// All set methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrintingPress(int printingPress) {
		this.printingPress = printingPress;
	}

}
