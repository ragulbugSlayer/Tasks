package SeleniumCodes;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Task10 
{
	public static void main(String[]args) 
	{

		Vector<Object> ve = new Vector<Object>();

		ve.add("Test");
		ve.add('a');
		ve.add(null);
		ve.add(10.5f);
		ve.add(100.0);
		ve.add('b');
		ve.add('a');
		ve.add(null);
		ve.add("Java");
		ve.add(true);
		ve.add("Array");
		ve.add(false);
		ve.add(5);
		ve.add("Selenium");
		ve.add('v');
		ve.add("Test");

		System.out.println(ve);

		System.out.println(ve.size());

		System.out.println(ve.get(4));

		// Collections not allows in vector
		
		System.out.println("==========< forloop >==========");
		
		for (int i = 0; i <= ve.size()-1; i++) 
		{
			System.out.println(ve.get(i));
		}
		
		System.out.println("==========< forEach >==========");
		
		for (Object fe : ve) 
		{
			System.out.println(fe);
		}

		System.out.println("==========< Iterator >==========");
		
		Iterator<Object> it = ve.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("==========< List Iterator >==========");
		
		ListIterator<Object> li = ve.listIterator();
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		
		System.out.println("==========< Enumeration >==========");
		
		Enumeration<Object> en = ve.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());			
		}	
	}
}
