package SeleniumCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Task7 {

	public static void main(String[] args) 
	{
		ArrayList<Double> ar = new ArrayList<Double>();

		ar.add(100.0);
		ar.add(300.0);
		ar.add(200.0);
		ar.add(500.0);
		ar.add(400.0);
//		ar.add(null);
		ar.add(700.0);
		ar.add(600.0);
		ar.add(900.0);
//		ar.add(null);
		ar.add(800.0);
		ar.add(1000.0);

		System.out.println(ar); //Before Sorting

		System.out.println(ar.size());//Total Size

		System.out.println(ar.get(4));//Specific value

				Collections.sort(ar); //null not supported

				System.out.println(ar);

		System.out.println("=========< for loop >=========");

		for (int i = 0; i <= ar.size()-1; i++) 
		{
			System.out.println(ar.get(i));
		}

		System.out.println("=========< for each >=========");

		for (Double af : ar) 
		{
			System.out.println(af);
		}

		//Iterator allows only forward printing
		System.out.println("=========< iterator >=========");

		Iterator<Double> al = ar.iterator();

		while (al.hasNext()) 
		{
			System.out.println(al.next());
		}

		//ListIterator allows Both forward and reverse printing
		System.out.println("=========< List iterator forward >=========");

		ListIterator<Double> li = ar.listIterator();

		while (li.hasNext()) 
		{
			System.out.println(li.next());
		}
		
		System.out.println("=========< List iterator reverse >=========");

		while (li.hasPrevious()) 
		{
			System.out.println(li.previous());
		}
	}
}
