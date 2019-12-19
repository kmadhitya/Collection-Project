package com.proj.collectionproject;

import java.util.Comparator;

import org.testng.annotations.BeforeSuite;

public class MyOwnComparator implements Comparator<Integer>{

	@BeforeSuite
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return +1;
		else if(o1>o2)
			return -1;
		else
		return 0;
	}
	

}
