package it.exolab.jdbc.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.exolab.jdbc.model.Prodotto;
import it.exolab.jdbc.service.DAOService;

public class GestoreController {

	 public void insert(Prodotto p) throws ClassNotFoundException, SQLException{
		 
		 
			String query = "insert into 'Prodotti'(PRODOTTO_ID, DESCRIZIONE, QUANTITA, PREZZO, COLLOCAZIONE) values (?,?,?,?,?)";
			PreparedStatement stmt = DAOService.getInstance().getConnection().prepareStatement(query);
			stmt.setString(1, p.getProdottoId());
			stmt.setString(2, p.getDescrizione());
			stmt.setInt(3, p.getQuantita());
			stmt.setDouble(4, p.getPrezzo());
			stmt.setString(5, p.getCollocazione());
			stmt.execute();
			DAOService.getInstance().closeConnection();
			
			
			
		}



}
