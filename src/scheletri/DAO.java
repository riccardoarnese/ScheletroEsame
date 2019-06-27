package scheletri;

public class DAO {
	
	//Scheletro metodo DAO
	public List<E> nomeMetodo(){
			
		final String sql = "" ;
		List<E> result = new ArrayList<>();
			
		try {
	    Connection conn = DBConnect.getConnection() ;
	    PreparedStatement st = conn.prepareStatement(sql) ;
				
	    //Set parameter
		 
	    //Execute Query		
	    ResultSet res = st.executeQuery() ;
				
	    while(res.next()) {
	 
	                //Faccio cose
						   } 
				
	conn.close();
	return result ;

	} catch (SQLException e) {
		
	System.out.println("Errore DB: "+e);
	}
		
	}
	SELECT e.offense_type_id,e2.offense_type_id,COUNT(DISTINCT e.district_id)
	FROM events e,events e2
	WHERE YEAR(e.reported_date)=2014 AND YEAR(e2.reported_date)=2014 
	AND e.district_id=e2.district_id
	AND e.offense_category_id='larceny' AND e2.offense_category_id='larceny'
	AND e.offense_type_id>e2.offense_type_id
	GROUP BY  e.offense_type_id,e2.offense_type_id
	
	
	
	SELECT e.offense_type_id,e2.offense_type_id,COUNT(DISTINCT e.neighborhood_id)
	FROM events e,events e2
	WHERE MONTH(e.reported_date)=3 AND MONTH(e2.reported_date)=3 
	AND e.neighborhood_id=e2.neighborhood_id
	AND e.offense_category_id='auto-theft' AND e2.offense_category_id='auto-theft'
	AND e.offense_type_id>e2.offense_type_id
	GROUP BY  e.offense_type_id,e2.offense_type_id
	
	
}
