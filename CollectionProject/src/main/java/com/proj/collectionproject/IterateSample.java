package com.proj.collectionproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class IterateSample {
	
	@Test(enabled=false)
	public void itrWithArrayList()
	{
		List<String> al = new ArrayList<String>();
		al.add("Adhitya");
		al.add("Sravanthi");
		al.add("Adhi");
		al.add("Deepthi");
		al.add("Naveena");
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			if (str.equalsIgnoreCase("Adhi"))
			{
				itr.remove();
			}
		}
		System.out.println(al);
	}
	
	@Test
	public void itrWithHashMap()
	{
		Map<Integer,String> lhm = new TreeMap<Integer, String>(new MyOwnComparator());
		lhm.put(1001,"Adhitya");
		lhm.put(1004,"Sravanthi");
		lhm.put(1002,"Deepthi");
		lhm.put(1003,"Naveena");
		System.out.println(lhm);
		Set<Entry<Integer, String>> eSet = lhm.entrySet();
		Iterator<Entry<Integer, String>> itr = eSet.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m = itr.next();
			if (m.getKey().equals(1003))
			{
				m.setValue("Pani");
			}
		}
		System.out.println(lhm);
		
	}
	
	
	

}
