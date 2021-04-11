import prBookStore.SalesBookStore;

public class MainSalesBookStore {
	public static void main(String[] args) {

		SalesBookStore salesBook = new SalesBookStore(10, 20, new String[] { "George Orwell", "Isaac Asimov" });

		salesBook.addBook("george orwell", "1984", 8.20);
		salesBook.addBook("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
		salesBook.addBook("Isaac Asimov", "Fundación e Imperio", 9.40);
		salesBook.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		salesBook.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
		salesBook.addBook("Isaac Asimov", "La Fundación", 7.30);
		salesBook.addBook("William Gibson", "Neuromante", 8.30);
		salesBook.addBook("Isaac Asimov", "Segunda Fundación", 8.10);
		salesBook.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		salesBook.addBook("George Orwell", "1984", 6.20);
		salesBook.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);

		System.out.println(salesBook.toString());		
		
		salesBook.deleteBook("George Orwell", "1984");
		salesBook.deleteBook("Aldous Huxley", "Un Mundo Feliz");
		salesBook.deleteBook("Isaac Newton", "Arithmetica Universalis");
		salesBook.deleteBook("James Gosling", "The Java Language Specification");
		
		System.out.println(salesBook.toString());		
		
		System.out.println("getFinalPrice(George Orwell, 1984): " 											+ salesBook.getFinalPrice("George Orwell", "1984"));
		System.out.println("getFinalPrice(Philip K. Dick,¿Sueñan los androides con ovejas eléctricas?): " 	+ salesBook.getFinalPrice("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
		System.out.println("getFinalPrice(isaac asimov, fundación e imperio): " 							+ salesBook.getFinalPrice("isaac asimov", "fundación e imperio"));
		System.out.println("getFinalPrice(Ray Bradbury, Fahrenheit 451): " 									+ salesBook.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));
		System.out.println("getFinalPrice(Aldous Huxley, Un Mundo Feliz): " 								+ salesBook.getFinalPrice("Aldous Huxley", "Un Mundo Feliz"));
		System.out.println("getFinalPrice(Isaac Asimov, La Fundación): " 									+ salesBook.getFinalPrice("Isaac Asimov", "La Fundación"));
		System.out.println("getFinalPrice(william gibson, neuromante): " 									+ salesBook.getFinalPrice("william gibson", "neuromante"));
		System.out.println("getFinalPrice(Isaac Asimov, Segunda Fundación): " 								+ salesBook.getFinalPrice("Isaac Asimov", "Segunda Fundación"));
		System.out.println("getFinalPrice(Isaac Newton, Arithmetica Universalis): " 						+ salesBook.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));

	}
}
