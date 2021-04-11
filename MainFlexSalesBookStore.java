import prBookStore.DiscountAuthor;
import prBookStore.FlexSalesBookStore;

public class MainFlexSalesBookStore {
	public static void main(String[] args) {
		FlexSalesBookStore flexBookStore = new FlexSalesBookStore(new DiscountAuthor(20, new String[]{"George Orwell", "Isaac Asimov"}));
		
		flexBookStore.addBook("george orwell", "1984", 8.20);
		flexBookStore.addBook("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
		flexBookStore.addBook("Isaac Asimov", "Fundación e Imperio", 9.40);
		flexBookStore.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		flexBookStore.addBook("Aldous Huxley", "Un Mundo Feliz", 6.50);
		flexBookStore.addBook("Isaac Asimov", "La Fundación", 7.30);
		flexBookStore.addBook("William Gibson", "Neuromante", 8.30);
		flexBookStore.addBook("Isaac Asimov", "Segunda Fundación", 8.10);
		flexBookStore.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		flexBookStore.addBook("George Orwell", "1984", 6.20);
		flexBookStore.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		System.out.println(flexBookStore.toString());
		
		flexBookStore.deleteBook("George Orwell", "1984");
		flexBookStore.deleteBook("Aldous Huxley", "Un Mundo Feliz");
		flexBookStore.deleteBook("Isaac Newton", "Arithmetica Universalis");
		flexBookStore.deleteBook("James Gosling", "The Java Language Specification");

		System.out.println(flexBookStore.toString());
		
		System.out.println("getFinalPrice(George Orwell, 1984) : "										 		+ flexBookStore.getFinalPrice("George Orwell", "1984"));
		System.out.println("getFinalPrice(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?) : "	 	+ flexBookStore.getFinalPrice("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
		System.out.println("getFinalPrice(isaac asimov, fundación e imperio) : "								+ flexBookStore.getFinalPrice("isaac asimov", "fundación e imperio"));
		System.out.println("getFinalPrice(Ray Bradbury, Fahrenheit 451) : "									 	+ flexBookStore.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));
		System.out.println("getFinalPrice(Aldous Huxley, Un Mundo Feliz) : "									+ flexBookStore.getFinalPrice("Aldous Huxley", "Un Mundo Feliz"));
		System.out.println("getFinalPrice(Isaac Asimov, La Fundación) : "										+ flexBookStore.getFinalPrice("Isaac Asimov", "La Fundación"));
		System.out.println("getFinalPrice(william gibson, neuromante) : "										+ flexBookStore.getFinalPrice("william gibson", "neuromante"));
		System.out.println("getFinalPrice(Isaac Asimov, Segunda Fundación) : "								 	+ flexBookStore.getFinalPrice("Isaac Asimov", "Segunda Fundación"));
		System.out.println("getFinalPrice(Isaac Newton, Arithmetica Universalis) : "							+ flexBookStore.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));

	}
}
