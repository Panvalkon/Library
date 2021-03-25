package prBookStore;

public class Book {
	private static double percVAT = 10;
	private String author;
	private String title;
	private double basePrice;

	public Book(String author, String title, double basePrice) {
		this.author = author;
		this.title = title;
		this.basePrice = basePrice;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getTitle() {
		return this.title;
	}

	public double getBasePrice() {
		return this.basePrice;
	}

	public double getFinalPrice() {
		return this.basePrice + (this.basePrice * percVAT) / 100;
	}

	@Override
	public String toString() {
		return "(" + this.author + "; " + this.title + "; " + this.basePrice + "; " + percVAT + "%; "
				+ this.getFinalPrice() + ")";
	}

	public static double getVAT() {
		return percVAT;
	}

	public static void setVAT(double newVAT) {
		percVAT = newVAT;
	}
}
