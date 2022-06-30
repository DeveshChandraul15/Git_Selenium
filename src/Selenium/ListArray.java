package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		for(int arr:a) {
			System.out.println(arr);
		}
		for(int i=0;i<a.size();i++) {
			System.out.println(i);
		}
		int[] arr2 = { 1, 2, 4, 5, 6 };	
		List num= Arrays.asList(arr2);
		Object[] arr3=a.toArray();
	}
	public  void Dev() {
		String s = "name";
		String a = "name";
		
		String b = new String("Dev");
		String c = new String("Adarsh");
		String name=("Dev code rockets");
		String[] splittedString=name.split("");
		for(String d:splittedString) {
			System.out.println(d);	
		}
		
	}
	public String Ads() {
	String 	names="Your code";
		return names;
	}
}
