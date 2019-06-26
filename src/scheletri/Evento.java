package scheletri;

import java.time.LocalDateTime;


public class Evento implements Comparable<Evento>{
	
	//Tipi di evento che possono accadere
	public enum TipoEvento {
		
	}
	
	private LocalDateTime time;
	private TipoEvento tipo;
	

	public TipoEvento getTipo() {
		return this.tipo;
	}
	
	//Comparatore eventi per tempo
	@Override
	public int compareTo(Evento o) {
		return this.time.compareTo(o.time);
	}

}
