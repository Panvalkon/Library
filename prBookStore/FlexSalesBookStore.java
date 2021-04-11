package prBookStore;

public class FlexSalesBookStore extends BookStore {
	private FlexDiscount flexDiscount;

	public FlexSalesBookStore(FlexDiscount flexDiscount) {
		super();
		this.flexDiscount = flexDiscount;
	}

	public FlexSalesBookStore(int size, FlexDiscount flexDiscount) {
		super(size);
		this.flexDiscount = flexDiscount;
	}

	public void setSale(FlexDiscount flexDiscount) {
		this.flexDiscount = flexDiscount;
	}

	public FlexDiscount getDiscount() {
		return this.flexDiscount;
	}

	@Override
	public void addBook(String author, String title, double price) {
		double discount = flexDiscount.getDiscount(new Book(author, title, price));
		if (discount > 0) {
			addBook(new BookOnSale(author, title, price, discount));
		} else {
			addBook(new Book(author, title, price));
		}
	}

	@Override
	public String toString() {
		String ss = new String();
		ss += flexDiscount.toString() + "\n";
		ss += super.toString();
		return ss;
	}
}
