package prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapProblems2 {

	public static void main(String[] args){



		HashMap<Integer, Double> sales1 = new HashMap<>();
		HashMap<Integer, Double> sales2 = new HashMap<>();

		sales1.put(1, 456.50); sales1.put(2, 965.75); sales1.put(3, 650.1);
		sales2.put(1, 456.50); sales2.put(2, 965.75); sales2.put(3, 650.1);

		List<Map<Integer, Double>> listOfSales = new LinkedList<>();
		listOfSales.add(sales1); listOfSales.add(sales2);

		System.out.print("\n--------------------------------------Test workedBoth--------------------------------------");
		System.out.print("\nOriginal Lists: \n" + sales1 + "\n" + sales2 + "\n");
		System.out.print("\nModified List: \n" + workedBoth(sales1, sales2));
		System.out.print("\n--------------------------------------End Test workedBoth-------------------------------------- \n");

		System.out.println();

		System.out.print("\n--------------------------------------Test onlyWorkedOne--------------------------------------");
		System.out.print("\nOriginal Lists: \n" + sales1 + "\n" + sales2 + "\n");
		System.out.print("\nModified List: \n" + onlyWorkedOne(sales1, sales2));
		System.out.print("\n--------------------------------------End Test onlyWorkedOne-------------------------------------- \n");

		System.out.println();


		System.out.print("\n--------------------------------------Test sortSales--------------------------------------");
		System.out.print("\nOriginal Lists: \n" + sales1 + "\n" + sales2 + "\n");
		System.out.print("\nModified List: \n" + sortSales(listOfSales));
		System.out.print("\n--------------------------------------End Test sortSales-------------------------------------- \n");

	}

	public static TreeMap<Integer, Double> workedBoth(Map<Integer, Double> a, Map<Integer, Double> b){

		Set<Integer> keysMap1 = a.keySet();
		Set<Integer> keysMap2 = b.keySet();
		TreeMap<Integer, Double> wbTreeMap = new TreeMap<>();

		for (Integer i : keysMap1)
			if (keysMap2.contains(i))
				wbTreeMap.put(i, (a.get(i) + b.get(i)));

		return wbTreeMap;
	}

	public static TreeMap<Integer, Double> onlyWorkedOne(Map<Integer, Double> a, Map<Integer, Double> b){

		Set<Integer> keysMap1 = a.keySet();
		Set<Integer> keysMap2 = b.keySet();
		TreeMap<Integer, Double> owoTreeMap = new TreeMap<>();

		for (Integer i : keysMap1)
			if (!keysMap2.contains(i))
				owoTreeMap.put(i, (a.get(i)));

		for (Integer i : keysMap2)
			if (!keysMap1.contains(i))
				owoTreeMap.put(i, (b.get(i)));

		return owoTreeMap;
	}

	public static List<Sales> sortSales(List<Map<Integer, Double >> sales){

		List<Sales> listSales = new ArrayList<>();

		for (int i = 0; i < sales.size(); i++){
			Set<Integer> mapKeys = sales.get(i).keySet();
			for (Integer j : mapKeys){
				listSales.add(new Sales(j, sales.get(i).get(j), i));
			}

		}

		Collections.sort(listSales, new SalesComparator());


		return listSales;
	}

}
