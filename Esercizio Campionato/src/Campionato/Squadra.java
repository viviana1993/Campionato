package Campionato;

import java.util.HashMap;

public class Squadra {
	
	//attributi
	private String nome;
	private int punti;
	private int retiSubite;
	private int retiFatte;
	private int differenzaReti;
	
	private HashMap<String,Giocatore> ListaGiocatoriSquadra=new HashMap<String,Giocatore>();
	
	public HashMap<String, Giocatore> getListaGiocatoriSquadra() {
		return ListaGiocatoriSquadra;
	}
	


	@Override
	public String toString() {
		return "Squadra [nome=" + nome + ", punti=" + punti + "]";
	}



	public void setListaGiocatoriSquadra(
			HashMap<String, Giocatore> listaGiocatoriSquadra) {
		ListaGiocatoriSquadra = listaGiocatoriSquadra;
	}


	//costruttore1
	public Squadra() {
		super();
	}

	
	//costruttore2
	
	public Squadra(String nome, int punti, int retiSubite, int retiFatte,
			int differenzaReti) {
		super();
		this.nome = nome;
		this.punti = punti;
		this.retiSubite = retiSubite;
		this.retiFatte = retiFatte;
		this.differenzaReti = differenzaReti;
	}

	


	public Squadra(String nome) {
		super();
		this.nome = nome;
	}


	//metodi
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPunti() {
		return punti;
	}


	public void setPunti(int punti) {
		this.punti = punti;
	}


	public int getRetiSubite() {
		return retiSubite;
	}


	public void setRetiSubite(int retiSubite) {
		this.retiSubite = retiSubite;
		calcolaDiffReti();
	}


	public int getRetiFatte() {
		return retiFatte;
	}


	public void setRetiFatte(int retiFatte) {
		this.retiFatte = retiFatte;
		calcolaDiffReti();
	}


	public int getDifferenzaReti() {
		return differenzaReti;
	}


	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}
	
	public void aggiungiGiocatore(Giocatore g){
		ListaGiocatoriSquadra.put(g.getcF(), g);
		
	}
	public boolean trovaGiocatore(Giocatore g){
		if(ListaGiocatoriSquadra.containsKey(g.getcF()))
			return true;
		return false;
		
	}
	
	private void calcolaDiffReti(){
		differenzaReti=retiFatte-retiSubite;
	}
}
