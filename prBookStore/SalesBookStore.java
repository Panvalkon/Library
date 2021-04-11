package prBookStore;

public class SalesBookStore extends BookStore {
	private double discountPerc;
	private String[] authorOnSales;

	public SalesBookStore(double discoutn, String[] authorsOnSale) {
		super();
		this.authorOnSales = authorsOnSale;
	}

	public SalesBookStore(int size, double discount, String[] authorsOnSale) {
		super(size);
		this.discountPerc = discount;
		this.authorOnSales = authorsOnSale;
	}

	public void setSale(double discount, String[] author) {
		this.discountPerc = discount;
		authorOnSales = author;
	}

	public double getDiscount() {
		return this.discountPerc;
	}

	public String[] getAuthorsOnSale() {
		return authorOnSales;
	}

	@Override
	public void addBook(String author, String title, double price) {
		if (seekSalesAuthors(author) >= 0) {
			addBook(new BookOnSale(author, title, price, discountPerc));

		} else {
			addBook(new Book(author, title, price));
		}
	}

	@Override
	public String toString() {
		String ss = new String();
		ss += this.getDiscount() + "%";
		String cc = new String();

		for (int i = 0; i < this.authorOnSales.length - 1; i++) {
			cc += this.authorOnSales[i] + ", ";
		}
		cc += this.authorOnSales[this.authorOnSales.length - 1];
		ss += "[" + cc + "]\n";

		ss += super.toString();
		return ss;
	}

	private int seekSalesAuthors(String author) {
		int pos = 0;
		while (pos != this.authorOnSales.length && !this.authorOnSales[pos].equalsIgnoreCase(author))
			pos++;
		if (pos == this.authorOnSales.length)
			pos = -1;
		return pos;
	}
}
