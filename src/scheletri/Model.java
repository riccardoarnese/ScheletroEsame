package scheletri;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

public class Model<E> {
	
	// EDITOR per il completamento automatico
	String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ._";
	
	private EventsDao dao;
	private Map<Integer,E> idMap;
	private Graph<E,DefaultWeightedEdge> grafo;
	
	// Recursion
	private List<E> best;
	
	//Inizializzo model
	public Model() {
		dao  = new EventsDao();
		idMap = new HashMap<>();
	}
	
	//Prendere lista degli anni
	public List<Year> getYearsList(){
		return dao.yearsList();
	}
	
	public void creaGrafo() {
		
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		
		
		System.out.println("GRAFO CREATO!");
		System.out.println("#VERTICI: "+this.grafo.vertexSet().size());
		System.out.println("#ARCHI: "+this.grafo.edgeSet().size());
		
	}
	
	public void recursionI() {
		best = new ArrayList<>();
		List<E> parziale = new ArrayList<>();
		
		recursion(parziale);
	}
	
	private void recursion(List<E> parziale) {
		
		//Condizione di terminazione
		if () {
			best = new ArrayList<>(parziale);
			return;
		}
		
		//Ramo da troncare per qualche motivo
		if ( )
			return;
		
		//Caso intermedio
		for ( ) {
			
			partial.add();
			recursion(partial);
			partial.remove();
		}
	}
	
	//Return graph
	public Graph<E, DefaultWeightedEdge> getGrafo() {
		return this.grafo;
	}

	//Return map
	public Map<Integer, E> getdMap() {
		return idMap;
	}

}
