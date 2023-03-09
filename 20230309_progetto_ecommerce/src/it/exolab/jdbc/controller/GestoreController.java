package it.exolab.jdbc.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.exolab.jdbc.model.Prodotto;
import it.exolab.jdbc.service.DAOService;

public class GestoreController {

	 public void insert(Prodotto p) throws ClassNotFoundException, SQLException{
		 
		 
			String query = "insert into PRODOTTI(PRODOTTO_ID, DESCRIZIONE, QUANTITA, PREZZO, COLLOCAZIONE) values (?,?,?,?,?)";
			PreparedStatement stmt = DAOService.getInstance().getConnection().prepareStatement(query);
			stmt.setString(1, p.getProdottoId());
			stmt.setString(2, p.getDescrizione());
			stmt.setInt(3, p.getQuantita());
			stmt.setDouble(4, p.getPrezzo());
			stmt.setString(5, p.getCollocazione());
			stmt.execute();
			DAOService.getInstance().closeConnection();			
		}
	 public List<Prodotto> findAll() throws ClassNotFoundException, SQLException{
			
			List<Prodotto> ret = new ArrayList<Prodotto>();
			Statement stmt= DAOService.getInstance().getConnection().createStatement();  
			ResultSet rs=stmt.executeQuery("select * from PRODOTTI");  
			while(rs.next())  {
				String prodottoId = rs.getString("PRODOTTO_ID");
				String descrizione = rs.getString("DESCRIZIONE");
				int quantita = rs.getInt("QUANTITA");
				double prezzo = rs.getDouble("PREZZO");
				String collocazione = rs.getString("COLLOCAZIONE");
				Prodotto model =  new Prodotto(prodottoId,descrizione,quantita,prezzo,collocazione);
				ret.add(model);					
			}			
			DAOService.getInstance().closeConnection();
			return ret;
			
		}



}
