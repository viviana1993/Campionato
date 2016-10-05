package Campionato;

public class Giocatore {
	
	//attributi
	private String nome;
	private String cognome;
	private int et�;
	private String cF;
	private String ruolo;
	private double stipendio;
	private int ammonizioni;
	private int espulsione;
	private int goal;
	
	@Override
	public String toString() {
		return nome + " "+cognome +" "+ et� +" " +cF +" "+goal ;
	}

	//costruttore1
	public Giocatore() {
		
	}
	
	//costruttore2
	public Giocatore(String nome, String cognome, int et�, String cF,
			String ruolo, double stipendio, int ammonizioni, int espulsione,
			int goal) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
		this.cF = cF;
		this.ruolo = ruolo;
		this.stipendio = stipendio;
		this.ammonizioni = ammonizioni;
		this.espulsione = espulsione;
		this.goal = goal;
	}
	
	
	
	public Giocatore(String nome, String cognome, int et�, String cF) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
		this.cF = cF;
		
	}

	//metodi
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		this.et� = et�;
	}

	public String getcF() {
		return cF;
	}

	public void setcF(String cF) {
		this.cF = cF;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public int getAmmonizioni() {
		return ammonizioni;
	}

	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}

	public int getEspulsione() {
		return espulsione;
	}

	public void setEspulsione(int espulsione) {
		this.espulsione = espulsione;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}
	
	
	
	
	
	
}
