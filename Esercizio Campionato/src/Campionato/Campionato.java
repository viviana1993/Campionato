package Campionato;

import java.util.HashMap;


public class Campionato {
	//attributi
	private String nome;
	private HashMap<String,Giocatore> ListaGiocatori=new HashMap<String,Giocatore>();
	private HashMap<String,Squadra> ListaSquadre=new HashMap<String,Squadra>();
	private HashMap<String,Partita> ListaPartita=new HashMap<String,Partita>();
	

	//costruttori
	public Campionato() { 
		super();
	}

	public Campionato(String nome) {
		super();
		this.nome = nome;
	}
	
	
	//metodi getter-setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String,Giocatore> getListaGiocatori() {
		return ListaGiocatori;
	}

	public void setListaGiocatori(HashMap<String,Giocatore> listaGiocatori) {
		ListaGiocatori = listaGiocatori;
	}

	public HashMap<String,Squadra> getListaSquadre() {
		return ListaSquadre;
	}

	public void setListaSquadre(HashMap<String,Squadra> listaSquadre) {
		ListaSquadre = listaSquadre;
	}

	public HashMap<String,Partita> getListaPartita() {
		return ListaPartita;
	}

	public void setListaPartita(HashMap<String,Partita> listaPartita) {
		ListaPartita = listaPartita;
	}
	
	
	
	
	//metodo per aggiungere giocatori al campionato
	public void aggiungiGiocatore(Giocatore g){
		ListaGiocatori.put(g.getcF(),g);
		
	}
	
	
	//metodo per aggiungere squadra al campionato
	public void aggiungiSquadra(Squadra s){
		ListaSquadre.put(s.getNome(), s);
	}
	
	
	//metodo per aggiungere partita al campionato
	public void aggiungiPartita(Partita p){
		
		ListaPartita.put(p.toString(), p);
		
		for(Giocatore g:p.getListaMarcatori().values()){//values mi permette di trasformare la mappa in collezione

			Giocatore g1 =ListaGiocatori.get(g.getcF());
			
			g1.setGoal(g1.getGoal()+g.getGoal());
		}
		
		for(Giocatore g:p.getListaAmmoniti().values()){

			Giocatore g1 =ListaGiocatori.get(g.getcF());
			
			g1.setAmmonizioni(g1.getAmmonizioni()+g.getAmmonizioni());
		}
		
		
		for(Giocatore g:p.getListaEspulsi().values()){

			Giocatore g1 =ListaGiocatori.get(g.getcF());
			
			g1.setEspulsione(g1.getEspulsione()+g.getEspulsione());
		}
		
		
	}
	
	
	
	public boolean trovaSquadra(Squadra s){
		
		if(ListaSquadre.containsKey(s.getNome())) 
			return true;//squadra trovata
		return false;
	}
	
	
	public boolean trovaGiocatore(Giocatore g)
	{
		
		if(ListaGiocatori.containsKey(g.getcF()))
			return true;
		return false;
	}	
	

}
