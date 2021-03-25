package prBookStore;

import java.util.Arrays;

public class BookStore {
	private static final int INITIAL_CAPACITY = 8;
	private int numBooks;
	private Book[] books;

	public BookStore() {
		this(INITIAL_CAPACITY);
	}

	public BookStore(int size) {
		books = new Book[size];
	}

	public void addBook(String author, String title, double price) {
		Book book = new Book(author, title, price);
		addBook(book);
	}

	public void deleteBook(String author, String title) {
		int pos = seekBook(author, title);
		if (pos >= 0) {
			deleteBook(pos);
		}
	}

	public double getBasePrice(String author, String title) {
		int pos = seekBook(author, title);
		return pos == -1 ? 0 : books[pos].getBasePrice();
	}

	public double getFinalPrice(String author, String title) {
		int pos = seekBook(author, title);
		return pos == -1 ? 0 : books[pos].getFinalPrice();
	}
	
	@Override
	public String toString() {
		String ss = new String();
		if (numBooks > 0) {
			ss +=books[0].toString();
			for (int i=1; i<numBooks; i++) {
				ss += ",\n" + books[i].toString();
			}			
		}
		return "[ " + ss + " ]";
	}

	private void addBook(Book book) {
		int position = seekBook(book.getAuthor(), book.getTitle());
		if (position == -1) {
			if (numBooks == books.length) {
				books = Arrays.copyOf(books, books.length * 2);
			}
			books[numBooks++] = book;
		} else {
			books[position] = book;
		}
	}

	private void deleteBook(int position) {
		for (int pos = position; pos < numBooks - 1; pos++) {
			books[pos] = books[pos + 1];
		}
		books[--numBooks] = null;
	}

	private int seekBook(String author, String title) {
		int position = 0;
		while (position != numBooks && (!books[position].getAuthor().equalsIgnoreCase(author)
				&& !books[position].getTitle().equalsIgnoreCase(title))) {
			position++;
		}
		return position == numBooks ? -1 : position;
	}
}
