package CoinCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Coins {

	private List<Map<Integer,Integer>> combinationList = new ArrayList<Map<Integer,Integer>>();

	public List<Map<Integer, Integer>> solve(Set<Integer> denominations, int target)
	{
		findCoinCombo(denominations,target,new HashMap<Integer, Integer>());
		return combinationList;
	}



	private void findCoinCombo(Set<Integer> currentDenominations, int currentTarget,  Map<Integer,Integer> currentCoinCombinationMap )
	{
		Set<Integer> newDenominations = new HashSet<Integer>(currentDenominations);

		for(Integer denominationValue : currentDenominations)
		{
			Map<Integer,Integer> newCoinMap = new HashMap<Integer, Integer>(currentCoinCombinationMap);

			int tempValue = newCoinMap.containsKey(denominationValue) ?  newCoinMap.get(denominationValue) + 1 : 1;
			int newTarget = currentTarget - denominationValue;

			newCoinMap.put(denominationValue, tempValue );

			if(newTarget == 0 )  combinationList.add(newCoinMap);

			if(newTarget > 0)
			{
				findCoinCombo(newDenominations, newTarget, newCoinMap);
				newDenominations.remove(denominationValue);	
			}
		}
	}


}
