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

	
	
}
