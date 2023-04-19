package SeleniumCodes;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task9 {

	public static void main (String[]args) {

		LinkedList<String> li = new LinkedList<String>();

		li.add("Java");
		li.add("Array");
		li.add("Selenium");
		li.add("TestNG");
		li.add("Cucumber");
		li.add(null);
		li.add("String");
		li.add(null);
		li.add("Dotnet");
		li.add("C#");

		System.out.println(li);

		System.out.println(li.size());

		System.out.println(li.get(3));

		//		Collections.sort(li);

		//		System.out.println(li);

		//      4 Types Calling

		System.out.println("==========< forloop >==========");

		for (int i = 0; i <= li.size()-1; i++) 
		{
			System.out.println(li.get(i));
		}

		System.out.println("==========< forEach >==========");

		for (String fe : li) {
			System.out.println(fe);
		}

		System.out.println("==========< Iterator >==========");

		Iterator<String> it = li.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("==========< List Iterator >==========");

		ListIterator<String> lt = li.listIterator();

		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
	}
}
