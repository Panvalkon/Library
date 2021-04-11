package prBookStore;

public class DiscountPrice implements FlexDiscount {
	private double discountPerc;
	private double priceThreshold;
	
	public DiscountPrice(double discountPerc, double priceThreshold){
		this.discountPerc = discountPerc;
		this.priceThreshold = priceThreshold;
	}
	
	@Override
	public double getDiscount(Book book) {
	return book.getBasePrice() >= this.priceThreshold ? this.discountPerc : 0;	
	}
	
	@Override
	public String toString() {
		return this.discountPerc + "%(" + this.priceThreshold + ")";
	}
}
