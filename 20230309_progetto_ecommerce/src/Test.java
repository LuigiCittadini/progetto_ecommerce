import java.sql.SQLException;

import it.exolab.jdbc.controller.GestoreController;
import it.exolab.jdbc.model.Prodotto;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Prodotto p = new Prodotto("AAA011", "Libro", 10, 3.90, "A11");
		GestoreController gc = new GestoreController();
		gc.insert(p);

	}
	
	

}
