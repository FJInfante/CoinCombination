package test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import CoinCombination.Coins;

public class CoinsTest {

	Coins coins =  new Coins();
	
	
	@Test
	public void testSolve_OneDenominations_OneCombo() 
	{
		Set<Integer> denominations = new HashSet<Integer>();
		int target;

		denominations.add(5);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
	
		assertEquals("List Size : ",coinList.size(), 1);
		assertEquals("List[0] Map size: ", coinList.get(0).size(), 1);
		assertEquals("List[0] Map[0] value: ", (int) coinList.get(0).get(5), 1);
	}

	
	@Test
	public void testSolve_OneDenominations_NoCombo() 
	{
		Set<Integer> denominations = new HashSet<Integer>();
		int target;


		denominations.add(3);
		target = 5;

		
		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
		
		assertEquals("List Size : ",coinList.size(), 0);
	}
	
	@Test
	public void testSolve_TwoDenominations_TwoCombo_OneMapEach() 
	{
		Set<Integer> denominations = new HashSet<Integer>();
		int target;

		denominations.add(1);
		denominations.add(5);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
			
		assertEquals("List Size : ",coinList.size(), 2);
		assertEquals("List[0] Map size: ", coinList.get(0).size(), 1);
		assertEquals("List[1] Map size: ", coinList.get(1).size(), 1);
		assertEquals("List[0] Map[0] value: ", (int) coinList.get(0).get(1), 5);
		assertEquals("List[0] Map[1] value: " ,(int) coinList.get(1).get(5), 1);
	}

	@Test
	public void testSolve_TwoDenominations_TwoCombo_TwoMap() 
	{
		Set<Integer> denominations = new HashSet<Integer>();
		int target;

		denominations.add(4);
		denominations.add(1);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
		
		assertEquals("List Size :", coinList.size(), 2);
		assertEquals("List[0] Map size: " , coinList.get(0).size(), 1);
		assertEquals("List[1] Map size: ", coinList.get(1).size(), 2);

		assertEquals("List[0] Map[1] value: ", (int) coinList.get(0).get(1), 5);

		assertEquals("List[1] Map[1] value: " ,(int) coinList.get(1).get(1), 1);
		assertEquals("List[1] Map[4] value: ", (int) coinList.get(1).get(4), 1);
	}
	
	@Test
	public void testSolve_TwoDenominations_TwoCombo_TwoMapV2() 
	{
		Set<Integer> denominations = new HashSet<Integer>();
		int target;

		denominations.add(3);
		denominations.add(1);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
		
		assertEquals("List Size :", coinList.size(), 2);
		assertEquals("List[0] Map size: " , coinList.get(0).size(), 1);
		assertEquals("List[1] Map size: ", coinList.get(1).size(), 2);

		assertEquals("List[0] Map[1] value: ", (int) coinList.get(0).get(1), 5);

		assertEquals("List[1] Map[1] value: " ,(int) coinList.get(1).get(1), 2);
		assertEquals("List[1] Map[4] value: ", (int) coinList.get(1).get(3), 1);
	}
	
	@Test
	public void testSolve_TwoDenominations_ThreeCombo() 
	{
		Set<Integer> denominations = new TreeSet<Integer>();
		int target;

		denominations.add(1);
		denominations.add(2);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
					
		assertEquals("List Size :", coinList.size(), 3);
		assertEquals("List[0] Map size: " , coinList.get(0).size(), 1);
		assertEquals("List[1] Map size: ", coinList.get(1).size(), 2);
		assertEquals("List[2] Map size: ", coinList.get(2).size(), 2);

		assertEquals("List[0] Map[1] value: ", (int) coinList.get(0).get(1), 5);

		assertEquals("List[1] Map[1] value: " ,(int) coinList.get(1).get(1), 3);
		assertEquals("List[1] Map[2] value: ", (int) coinList.get(1).get(2), 1);
		
		assertEquals("List[2] Map[1] value: " ,(int) coinList.get(2).get(1), 1);
		assertEquals("List[2] Map[2] value: ", (int) coinList.get(2).get(2), 2);
		
		
	}
	
	
	@Test
	public void testSolve_ThreeDenominations_FiveCombo() 
	{
		Set<Integer> denominations = new TreeSet<Integer>();
		int target;

		denominations.add(1);
		denominations.add(2);
		denominations.add(3);
		target = 5;

		List<Map<Integer, Integer>> coinList = coins.solve(denominations, target);
				
		assertEquals("List Size :", coinList.size(), 5);
		assertEquals("List[0] Map size: " , coinList.get(0).size(), 1);
		assertEquals("List[1] Map size: ", coinList.get(1).size(), 2);
		assertEquals("List[2] Map size: ", coinList.get(2).size(), 2);
		assertEquals("List[3] Map size: ", coinList.get(1).size(), 2);
		assertEquals("List[4] Map size: ", coinList.get(2).size(), 2);

		assertEquals("List[0] Map[1] value: ", (int) coinList.get(0).get(1), 5);

		assertEquals("List[1] Map[1] value: " ,(int) coinList.get(1).get(1), 3);
		assertEquals("List[1] Map[2] value: ", (int) coinList.get(1).get(2), 1);
		
		assertEquals("List[2] Map[1] value: " ,(int) coinList.get(2).get(1), 2);
		assertEquals("List[2] Map[2] value: ", (int) coinList.get(2).get(3), 1);
	
	
		assertEquals("List[3] Map[1] value: " ,(int) coinList.get(3).get(1), 1);
		assertEquals("List[3] Map[2] value: ", (int) coinList.get(3).get(2), 2);
		
		assertEquals("List[4] Map[1] value: " ,(int) coinList.get(4).get(2), 1);
		assertEquals("List[4] Map[2] value: ", (int) coinList.get(4).get(3), 1);
	}
	

}
