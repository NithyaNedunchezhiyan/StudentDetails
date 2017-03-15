package com.org.unitTest;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.org.constituency.Candidates;
import com.org.constituencyDao.CandidateConstituency;

public class TestCode {
	CandidateConstituency ss=null;
	@Before
	public void setUp() {
		ss=new CandidateConstituency();
	}
	@Test
	public void testCaseUTC01_01() throws SQLException{
		List<Candidates> empset = new ArrayList<>();
		List<Candidates> cp=new ArrayList<>();								 
		String input="jayanagar";
		cp.add(new Candidates(1,"HariPrasad", "Congress"));
		cp.add(new Candidates(4,"AnanthKumar","BJP"));
		cp.add(new Candidates(5,"ShivKumar","JDS"));
		empset=ss.getconstituencyList(input);
		cp.removeAll(empset);
		if(cp.isEmpty()){
			assertTrue(true);
			
		}
		else
			fail();
	}
	@Test
	public void testCaseUTC01_02() throws SQLException{
		List<Candidates> empset = new ArrayList<>();
		List<Candidates> cp=new ArrayList<>();								
		String input="Basavanagudi";
		cp.add(new Candidates(3,"Francis","Congress"));
		cp.add(new Candidates(7,"Ashok","BJP"));
		empset=ss.getconstituencyList(input);
		//System.out.println(empset);
		cp.removeAll(empset);
		System.out.println(cp);
		if(cp.isEmpty()){
			assertTrue(true);	
		}
		else
			fail();
	}
	@Test
	public void testCaseUTC01_03() throws SQLException{
		List<Candidates> cp=new ArrayList<>();		
		List<Candidates> empset = new ArrayList<>();
		String input="Ramnagar";
		//cp.isEmpty();
		empset=ss.getconstituencyList(input);
		cp.removeAll(empset);
		if(cp.isEmpty()){
			assertTrue(true);
			
		}
		else
			fail();
		}

	@After
	public void tearDown(){
		
	}
}

