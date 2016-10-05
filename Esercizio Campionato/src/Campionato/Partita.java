package Campionato;

import java.util.Date;
import java.util.HashMap;

public class Partita {
	
	@Override
	public String toString() {
		if(squadraCasa!=null && squadraOspite!=null)
		return "Partita data=" + data  +" "+ squadraCasa.getNome()
				+"-"+  squadraOspite.getNome() + ", retiFatteCasa="
				+ retiFatteCasa + ", retiFatteOspite=" + retiFatteOspite
				+ ", risultato=" + risultato ;
		else return "";
	}


	//attributi
	private Date data;
	private Squadra squadraCasa;
	private Squadra squadraOspite;
	private int retiFatteCasa;
	private int retiFatteOspite;
	private char risultato;
	
	private HashMap<String, Giocatore> ListaAmmoniti=new HashMap<String, Giocatore>();
	private HashMap<String, Giocatore> ListaEspulsi=new HashMap<String, Giocatore>();
	private HashMap<String, Giocatore> ListaMarcatori=new HashMap<String, Giocatore>();
	
	
	//costruttori
	
	
	public Partita() {
		super();
	}


	public Partita(Date data, Squadra squadraCasa, Squadra squadraOspite,
			int retiFatteCasa, int retiFatteOspite, char risultato) {
		super();
		this.data = data;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiFatteCasa = retiFatteCasa;
		this.retiFatteOspite = retiFatteOspite;
		
		calcolaRisultato(retiFatteCasa, retiFatteOspite, risultato, squadraCasa, squadraOspite);
	}


	public Partita(Date data, Squadra squadraCasa, Squadra squadraOspite,
			int retiFatteCasa, int retiFatteOspite, char risultato,HashMap<String, Giocatore>ListaAmmoniti,HashMap<String, Giocatore>ListaEspulsi,HashMap<String, Giocatore>ListaMarcatori) {
		
		
		super();
		this.data = data;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiFatteCasa = retiFatteCasa;
		this.retiFatteOspite = retiFatteOspite;
		calcolaRisultato(retiFatteCasa, retiFatteOspite, risultato, squadraCasa, squadraOspite);
		this.ListaAmmoniti=ListaAmmoniti;
		this.ListaEspulsi=ListaEspulsi;
		this.ListaMarcatori=ListaMarcatori;
	}

	//metodi
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Squadra getSquadraCasa() {
		return squadraCasa;
	}


	public void setSquadraCasa(Squadra squadraCasa) {
		this.squadraCasa = squadraCasa;
	}


	public Squadra getSquadraOspite() {
		return squadraOspite;
	}


	public void setSquadraOspite(Squadra squadraOspite) {
		this.squadraOspite = squadraOspite;
	}


	public int getRetiFatteCasa() {
		return retiFatteCasa;
	}


	public void setRetiFatteCasa(int retiFatteCasa) {
		this.retiFatteCasa = retiFatteCasa;
	}


	public int getRetiFatteOspite() {
		return retiFatteOspite;
	}


	public void setRetiFatteOspite(int retiFatteOspite) {
		this.retiFatteOspite = retiFatteOspite;
	}


	public char getRisultato() {
		return risultato;
	}


	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}

	
		
	
	
	
	
	
	public HashMap<String, Giocatore> getListaAmmoniti() {
		return ListaAmmoniti;
	}


	public void setListaAmmoniti(HashMap<String, Giocatore> listaAmmoniti) {
		ListaAmmoniti = listaAmmoniti;
	}


	public HashMap<String, Giocatore> getListaEspulsi() {
		return ListaEspulsi;
	}


	public void setListaEspulsi(HashMap<String, Giocatore> listaEspulsi) {
		ListaEspulsi = listaEspulsi;
	}


	public HashMap<String, Giocatore> getListaMarcatori() {
		return ListaMarcatori;
	}


	public void setListaMarcatori(HashMap<String, Giocatore> listaMarcatori) {
		ListaMarcatori = listaMarcatori;
	}
	
	
	public void InserisciAmmonito(Giocatore g){
		
		ListaAmmoniti.put(g.getcF(), g);
	}
	public void InserisciEspulso(Giocatore g){
		
		ListaEspulsi.put(g.getcF(), g);
	}
	public void InserisciMarcatore(Giocatore g,int numGoal){
		
		if(ListaMarcatori!=null){
		if(!ListaMarcatori.containsKey(g.getcF())){
			
			ListaMarcatori.put(g.getcF(), g);
			g.setGoal(numGoal);
		}
		else{
			g.setGoal(g.getGoal()+numGoal);
			
		}
		}
	}
	
	private void calcolaRisultato(int retiFatteCasa,int retiFatteOspite,char risultato,Squadra squadraCasa,Squadra squadraOspite){
		char risultato2;
		if(squadraCasa!=null&&squadraOspite!=null)
			{
			if(retiFatteCasa<retiFatteOspite){
			
			risultato2='2';
			squadraOspite.setPunti(squadraOspite.getPunti()+3);
			squadraCasa.setPunti(0);
			

		}
		else if(retiFatteCasa>retiFatteOspite){
			risultato2='1';
			squadraCasa.setPunti(squadraCasa.getPunti()+3);
			squadraOspite.setPunti(0);
		}
		else{
			risultato2='X';
			squadraOspite.setPunti(squadraOspite.getPunti()+1);
			squadraCasa.setPunti(squadraCasa.getPunti()+1);
		}
		if(risultato==risultato2)
		this.risultato = risultato;
		else{
			this.risultato=risultato2;
			System.out.println("risultato inserito errato,è stato ricalcolato");
		}
			
			squadraCasa.setRetiFatte(squadraCasa.getRetiFatte()+retiFatteCasa);
			squadraCasa.setRetiSubite(squadraCasa.getRetiSubite()+retiFatteOspite);

			
			squadraOspite.setRetiFatte(squadraOspite.getRetiFatte()+retiFatteOspite);
			squadraOspite.setRetiSubite(squadraOspite.getRetiSubite()+retiFatteCasa);
			
			}
	}

}
