package it.exolab.jdbc.model;

public class Prodotto {
	
	private String prodottoId;
	private String descrizione;
	private int quantita;
	private float prezzo;
	private String collocazione;
	
	public Prodotto(String prodottoId, String descrizione, int quantita, float prezzo, String collocazione) {
		super();
		this.prodottoId = prodottoId;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.collocazione = collocazione;
	}

	public String getProdottoId() {
		return prodottoId;
	}

	public void setProdottoId(String prodottoId) {
		this.prodottoId = prodottoId;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public String getCollocazione() {
		return collocazione;
	}

	public void setCollocazione(String collocazione) {
		this.collocazione = collocazione;
	}
	
	

}
