package com.org.constituencyDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.org.constituency.Candidates;

import test4.Database;

public class CandidateConstituency {
	Connection con;

	public CandidateConstituency() {
		try {
			con = Database.getConnection();
		} catch (test4.DatabaseException e) {
			e.getCause().printStackTrace();
		}
	}
	public List<Candidates> getconstituencyList(String con_name) throws SQLException{
		List<Candidates> empset = new ArrayList<>();
		String query="SELECT C.ID,C.NAME,C.PARTY,CC.ID FROM CANDIDATES C,CONSTITUENCY CC WHERE CC.ID=C.CONSTITUENCYID AND CC.NAME=?";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1,con_name);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()){
			int can_id = rs.getInt("ID");
			String can_name = rs.getString("NAME");			 
			String can_party = rs.getString("PARTY");
			//String cons_id = rs.getString("ID");
			Candidates cand=new Candidates(can_id,can_name,can_party);
			empset.add(cand);
		}
		return empset;
	}

}





