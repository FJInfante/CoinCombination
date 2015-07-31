package CoinCombination;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoinMain {

	public static void main(String[] args) 
	{
		Coins coin = new Coins();

		Set<Integer> coinDenominations = new HashSet<Integer>();
		List<Map<Integer,Integer>> combinationList;

		coinDenominations.add(1); coinDenominations.add(2); coinDenominations.add(3);

		int target = 10;

		combinationList = coin.solve(coinDenominations, target);

		for (Map<Integer, Integer> map : combinationList)
			System.out.println(map);
	
	}

}
