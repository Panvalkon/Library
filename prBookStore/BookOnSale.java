package prBookStore;

public class BookOnSale extends Book {
	private double discoutnPerc;

	public BookOnSale(String author, String title, double price, double discoutn) {
		super(author, title, price);
		this.discoutnPerc = discoutn;
	}

	public double getDiscount() {
		return this.discoutnPerc;
	}

	@Override
	public double getFinalPrice() {
		double PX = this.getDiscoutedPrice();
		return PX + ((PX * super.getVAT()) / 100);
	}

	@Override
	public String toString() {
		String ss = new String();
		return ss += "(" + super.getAuthor() + "; " + super.getTitle() + "; " + super.getBasePrice() + "; "
				+ this.discoutnPerc + "%; " + this.getDiscoutedPrice() + "; " + super.getVAT() + "%; "
				+ this.getFinalPrice() + ")";
	}

	private double getDiscoutedPrice() {
		return super.getBasePrice() - ((super.getBasePrice() * this.getDiscount()) / 100);
	}
}
