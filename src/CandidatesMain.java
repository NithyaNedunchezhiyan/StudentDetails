import java.sql.SQLException;

import com.org.constituencyDao.CandidateConstituency;

public class CandidatesMain {
	public static void main(String args[]) throws SQLException{
		CandidateConstituency ss=new CandidateConstituency();
		ss.getconstituencyList("jayanagar");
	}
}
