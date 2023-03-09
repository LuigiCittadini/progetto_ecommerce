import java.sql.SQLException;

import it.exolab.jdbc.controller.GestoreController;
import it.exolab.jdbc.model.Prodotto;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		GestoreController gc = new GestoreController();
		
		System.out.println(gc.findAll().toString());

	}
	
	

}
