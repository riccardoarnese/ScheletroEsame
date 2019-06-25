package scheletri;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

public class Model {
	
	// EDITOR per il completamento automatico
	String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ._";
	
	private EventsDao dao;
	private Map<Integer,District> idMap;
	private Graph<District,DefaultWeightedEdge> graph;
	
	// Recursion
	private List<E> best;
	
	//Inizializzo model
	public Model() {
		dao  = new EventsDao();
		dMap = new HashMap<>();
	}
	
	//Prendere lista degli anni
	public List<Year> getYearsList(){
		return dao.yearsList();
	}
	
	public void creaGrafo() {
		graph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
	}
	
	public void recursionI() {
		best = new ArrayList<>();
		List<E> partial = new ArrayList<>();
		
		recursion(partial);
	}
	
	private void recursion(partial) {
		
		//Condizione di terminazione
		if () {
			best = new ArrayList<>(partial);
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
	public Graph<District, DefaultWeightedEdge> getGraph() {
		return this.graph;
	}

	//Return map
	public Map<Integer, District> getdMap() {
		return idMap;
	}

}
