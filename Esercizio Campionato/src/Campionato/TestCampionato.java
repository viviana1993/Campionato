package Campionato;

import java.util.Date;





public class TestCampionato {

	public static void main(String[] args) {
		ServizioCampionato s = new ServizioCampionato();
		Campionato c=new Campionato("Serie A");
	//prova metodo 1	
  Giocatore g1=s.registraGiocatore(c, "A", "A",  28,"1");
  Giocatore g2=s.registraGiocatore(c, "B", "B",  28 ,"2");
  Giocatore g3=s.registraGiocatore(c, "C", "C", 28,"3");
  Giocatore g4=s.registraGiocatore(c, "D", "D",  28,"4" );
  Giocatore g5=s.registraGiocatore(c, "E", "E", 28,"5");
  Giocatore g6=s.registraGiocatore(c, "F", "F",  28,"6" );
  Giocatore g7=s.registraGiocatore(c, "G", "G", 28, "7");
  Giocatore g8=s.registraGiocatore(c, "H", "H", 28, "8");
  Giocatore g9=s.registraGiocatore(c, "I", "I", 28,"9");
  Giocatore g10=s.registraGiocatore(c, "L", "L", 28,"10" );
  Giocatore g11=s.registraGiocatore(c, "M", "M",28,"11");
  
		
		for(  Giocatore m : c.getListaGiocatori().values()){
			System.out.println(m.getNome()+" "+m.getCognome());	
			}
		
		//PROVA METOD2
		Squadra s1=s.registraSquadra(c, "rrr");
		Squadra s2=s.registraSquadra(c, "fff");
		Squadra s3=s.registraSquadra(c, "sfs");
		Squadra s4=s.registraSquadra(c, "fsf");
		for(  Squadra sx : c.getListaSquadre().values()){
			System.out.println(sx.getNome());	
			}
		
		//prova metodo 3
		s.registraGiocatoreSquadra(c, g1, s1);
		s.registraGiocatoreSquadra(c, g2, s1);
        s.registraGiocatoreSquadra(c, g3, s1);
        s.registraGiocatoreSquadra(c, g4, s1);
        s.registraGiocatoreSquadra(c, g5, s2);
        s.registraGiocatoreSquadra(c, g6, s2);
        s.registraGiocatoreSquadra(c, g7, s3);
        s.registraGiocatoreSquadra(c, g8, s3);
        s.registraGiocatoreSquadra(c, g9, s3);
       
        s.registraGiocatoreSquadra(c, g10, s4);
        s.registraGiocatoreSquadra(c, g11, s4);
       
		for(  Squadra sx : c.getListaSquadre().values()){
			
			if(sx.getListaGiocatoriSquadra().size()!=0){
				System.out.println(sx.getNome());
			for(Giocatore g:sx.getListaGiocatoriSquadra().values()){
				System.out.println(g.getNome()+" "+g.getcF());
				
			                                                       }
			                                            }
			}
		
		
		//prova metodo4
		Date data=new Date();
		Partita p=new Partita();
		
		Partita p2 = s.registraPartita(c, s1,s2,2, 2, '1',p.getListaAmmoniti(),p.getListaEspulsi(),p.getListaMarcatori());
		
		if(p2!=null){
			System.out.println(p2.toString());
		
			p2.InserisciAmmonito(g1);
			p2.InserisciAmmonito(g2);
			p2.InserisciAmmonito(g3);
			
			p2.InserisciEspulso(g4);
			p2.InserisciEspulso(g5);
			p2.InserisciEspulso(g6);
			
			p2.InserisciMarcatore(g7,4);
			p2.InserisciMarcatore(g8,6);
			
			
			p2.InserisciMarcatore(g7, 1);
			System.out.println("Marcatori partita ");
			
			
		for(Giocatore m:p2.getListaMarcatori().values()){
			
			System.out.println(m.toString());
		}
		System.out.println("Giocatori ");
		for(Giocatore m1:c.getListaGiocatori().values()){
			
			System.out.println(m1.toString());
			}
		
		}
			
		else
			System.out.println("La partita non può essere inserita");
		
		
		//prova metodo5
		Giocatore CC=s.getCapoCannoniere(c);
		System.out.println("Capocannoniere= "+CC.toString());
		//prova metodo 6
		Squadra SV=s.getSquadraCampione(c);
		System.out.println("SquadraCampione= "+SV.toString());
	}

}
