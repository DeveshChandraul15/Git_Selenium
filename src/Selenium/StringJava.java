package Selenium;

public class StringJava extends ListArray {

	public static void main(String[] args) {
		String s = "name";
		String a = "name";
		
		String b = new String("Dev");
		String c = new String("Adarsh");
		String name="Dev code rockets";
		String[] splittedString=name.split("");
		for(String d:splittedString) {
			System.out.print(d);	
		}
		System.out.println(splittedString[0]);
		for (int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
		ListArray dem = new ListArray();
		dem.Dev();
		String dim=dem.Ads();
		System.out.println(dim);
	}

}
