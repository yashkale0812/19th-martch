package arrayStudy;

import java.util.Iterator;

public class ArrayList {

	public static  void main(String[] args) 
	{
		java.util.ArrayList ar=new java.util.ArrayList<>();
		
		ar.add("pune");
		ar.add(null);
		ar.add('A');
		ar.add(14);
		ar.add("pune");
		ar.add(null);
		ar.add(true);
		
		System.out.println(ar);
		System.out.println("===========================");
		Iterator a = ar.iterator();
		System.out.println("===========================");
		while (a.hasNext())
		{
			System.out.println(a.next());
			System.out.println("===========================");
		}
		
		for(Object yash:ar)
		{
			System.out.println(yash);
		}
		
		// "hii everyone"
		
		
		
	}

}
