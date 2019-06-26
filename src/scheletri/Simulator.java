package scheletri;

import java.util.PriorityQueue;

public class Simulator {
	
	//Coda
	private PriorityQueue<Evento> queue;
	
	//Modello del mondo
	
	
	// Parametri di simulazione (Che l'utente può modificare in ogni momento)
	
	// Statistiche da calcolare

	//Getter per le statistiche
	
	//Inizializzazione modello
	private Model model;
	
	public Simulator(Model model) {
		this.model = model;
	}
	
	//Metodo per inizializzare la simulazione
	public void init() {
		
		//Creo nuova coda
		queue = new PriorityQueue<>();
		
		//Svuoto liste precedenti
		
		//Inizializzo i parametri che mi servono
	}
	
	private void run() {
		
		//Pesco 1 evento per volta
		while ( !queue.isEmpty() ) {
			Evento evento = queue.poll();
			
			//Gestire i diversi tipi di evento
			switch(evento.getTipo()) {
			case :
				break;
			case :
				break;
			case :
				break;
			}
		}
		
	}

}
