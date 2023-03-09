package it.exolab.jdbc.model;

public class Ordine {	

	private int numeroOrdine;
	private Cliente cliente;
	private Prodotto prodotto;
	private Stato stato;
	private int quantita;
	
	public Ordine(int numeroOrdine, Cliente cliente, Prodotto prodotto, Stato stato, int quantita) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.cliente = cliente;
		this.prodotto = prodotto;
		this.stato = stato;
		this.quantita = quantita;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
}
