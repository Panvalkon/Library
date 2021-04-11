package prBookStore;

public class DiscountAuthor implements FlexDiscount {
	private double discountPerc;
	private String[] authorsOnSale;

	public DiscountAuthor(double discountPerc, String[] authors) {
		this.discountPerc = discountPerc;
		this.authorsOnSale = authors;
	}

	@Override
	public double getDiscount(Book book) {
		return this.seekAuthor(book.getAuthor()) ? discountPerc : 0;
	}

	@Override
	public String toString() {
		String ss = new String();
		ss += this.discountPerc + "%";
		String cc = new String();
		for (int i = 0; i < authorsOnSale.length - 1; i++) {
			cc += authorsOnSale[i] + ", ";
		}
		cc += authorsOnSale[authorsOnSale.length - 1];
		ss += "[" + cc + "]";
		return ss;
	}

	private boolean seekAuthor(String author) {
		int i = 0;
		while (i < this.authorsOnSale.length && !this.authorsOnSale[i].equalsIgnoreCase(author)) {
			i++;
		}
		return i == this.authorsOnSale.length ? false : true;
	}
}
