package Campionato;

import java.util.Date;
import java.util.HashMap;






public class ServizioCampionato {




	//metodo 1

	public Giocatore registraGiocatore(Campionato c,String nome,String cognome, int età, String cF)
	{
		Giocatore g=new Giocatore(nome,cognome,età,cF);
		//inizializzo
		c.aggiungiGiocatore(g);
		return g;
	}//fine metodo1

	//metodo2
	public Squadra registraSquadra(Campionato c,String nome){
		Squadra s=new Squadra(nome);
		c.aggiungiSquadra(s);
		return s;
	}//fine metodo2

	//metodo3

	public boolean registraGiocatoreSquadra(Campionato c,Giocatore g,Squadra s){
		boolean registrazione=false;

		if(!c.trovaGiocatore(g)||!c.trovaSquadra(s))
			registrazione=false;
		else{


			Squadra s1 = c.getListaSquadre().get(s.getNome());
			Giocatore g1 = c.getListaGiocatori().get(g.getcF());

			if(s1.trovaGiocatore(g1))
				registrazione=false;
			else
			{
				s1.aggiungiGiocatore(g1);
				registrazione=true;

			}
		}
		return registrazione;
	}

	//metodo4

	public Partita registraPartita(Campionato c,Squadra SquadraCasa,Squadra SquadraOspite,int retiFatteCasa,
			int retiFatteOspite,char risultato,HashMap<String,Giocatore> ListaAmmoniti,HashMap<String,Giocatore> ListaEspulsi,HashMap<String,Giocatore> ListaMarcatori)
	{
		Date data=new Date();
		Partita p=null;
		if(SquadraCasa==null||SquadraOspite==null||ListaAmmoniti==null||ListaEspulsi==null||ListaMarcatori==null)
			{
			System.out.println("Errore");
			p=null;
			}
		else{
			
		p=new Partita(data,SquadraCasa,SquadraOspite,retiFatteCasa,retiFatteOspite,risultato,ListaAmmoniti,ListaEspulsi,ListaMarcatori);
		
		c.aggiungiPartita(p);
		
		
		}
		return p;

		}
	
	//metodo5
	
	public Giocatore getCapoCannoniere(Campionato c)
	
	{
		Giocatore CC=new Giocatore();
		for (Giocatore g:c.getListaGiocatori().values()){
			if(g.getGoal()>CC.getGoal())
			CC=g;
		}
		return CC;
	}
	
	
	//metodo6
	public Squadra getSquadraCampione(Campionato c){
		Squadra s=new Squadra();
		for(Squadra s1:c.getListaSquadre().values()){
			if(s1.getPunti()>s.getPunti())
				s=s1;
			else if(s1.getPunti()==s.getPunti())
			{
				if(s1.getDifferenzaReti()>s.getDifferenzaReti())
					s=s1;
			}
		}
		return s;
		
	}
	}








