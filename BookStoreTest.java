import prBookStore.BookStore;

public class BookStoreTest {

	public static void main(String[] args) {
		BookStore store = new BookStore();
		store.addBook("george orwell", "1984", 8.20);
		store.addBook("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
		store.addBook("Isaac Asimov", "Fundación e Imperio", 9.40);
		store.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		store.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
		store.addBook("Isaac Asimov", "La Fundación", 7.30);
		store.addBook("William Gibson", "Neuromante", 8.30);
		store.addBook("Isaac Asimov", "Segunda Fundación", 8.10);
		store.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		store.addBook("George Orwell", "1984", 6.20);
		store.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
		System.out.println(store.toString());

		store.deleteBook("George Orwell", "1984");
		store.deleteBook("Aldous Huxley", "Un Mundo Feliz");
		store.deleteBook("Isaac Newton", "Arithmetica Universalis");
		store.deleteBook("James Gosling", "The Java Language Specification");
		System.out.println(store.toString());

		System.out.println(store.getFinalPrice("George Orwell", "1984"));
		System.out.println(store.getFinalPrice("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
		System.out.println(store.getFinalPrice("isaac asimov", "fundación e imperio"));
		System.out.println(store.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));
		System.out.println(store.getFinalPrice("Aldous Huxley", "Un Mundo Feliz"));
		System.out.println(store.getFinalPrice("Isaac Asimov", "La Fundación"));
		System.out.println(store.getFinalPrice("william gibson", "neuromante"));
		System.out.println(store.getFinalPrice("Isaac Asimov", "Segunda Fundación"));
		System.out.println(store.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));

	}

}
