package collection;

import java.util.*;

public class CollExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("One", "Bismark");
		map.put("Two", "Nana");
		map.put("Three", "Kwesi");
		map.put("Four", "Moses");
		map.put("Four", "Mary");
		map.put("Six", "Belinda");
		
//		System.out.println(map.get("Four"));
		
		Set set = map.entrySet();
		
		Iterator li = set.iterator();
		
		while(li.hasNext()) {
			
		   
		    System.out.println(map.toString());
		}
		
		
		
		
		
		
		
		

					
		
				
		
//		 LINKED LIST (Is good for Deletion and Inserting
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.add("Bismark");
//		list.add("Nana");
//		list.add("Otu");
//		list.add("Kwesi");
//		list.add("Bisamrk Otu");
//		
//		ListIterator<String> li = list.listIterator();
//		
//		while(li.hasNext()) {
//		
//	      System.out.println(li.next());
//		
//		}
		
		
		
		// TREESET
//		Set<String> set = new TreeSet<String>();
//		set.add("Bismark");
//		set.add("Nana");
//		set.add("Otu");
//		set.add("Kwesi");
//
//		Iterator<String> i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
		
             //  TREESET
//		Set<String> set = new TreeSet<String>();
//		set.add("Bismark");
//		set.add("Nana");
//		set.add("Otu");
//		set.add("Kwesi");
//		set.add("Bisamrk Otu");
//		
//		
//		Iterator<String> i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		
		
//		TreeSet<Long> set = new TreeSet<Long>();
		// We do down casting by bringing (long)
//		set.add((long) 23);
//		set.add((long) 23);
//		set.add((long) 23);
//		set.add((long) 23);

		
		
		
		//      HASH SET
//		Set<String> set = new HashSet<String>();
//		set.add("a");
//		set.add("Nana");
//		set.add("Kwesi");
//		set.add("Bismark");
		
//		int s = set.size();
//		int ob = set.hashCode();
//		System.out.println(ob);
//		
//		Iterator<String> names = set.iterator();
//		while(names.hasNext()) {
//			String name = (String)names.next();
//			System.out.println(name);
//		}
//		
		
		
		
		   //   LINKED LIST (Is good for Deletion and Inserting
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.add("Bismark");
//		list.add("Nana");
//		list.add("Otu");
//		list.add("Kwesi");
//		list.add(2, "Bisamrk Otu");
//		
//		String name = list.get(2);
//		System.out.println(name);
		
		
		
		
		//    ARRAY LIST (Is good for searching )
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Bismark");
//		list.add("Nana");
//		list.add("Otu");
//		list.add("Kwesi");
//		list.add(2, "Bisamrk Otu");
		
		
//		int s = list.size();
//		System.out.println(s);
//		
//		String str = list.get(2);
//		System.out.println(str);
		
		
		//  TO GET ALL YOUR ARRAY LIST OR LINKED LIST. WE USE ITERATOR
//		Iterator itera = list.iterator();
//		while(itera.hasNext()) {
//			
//			String ss = (String)itera.next();
//			System.out.println(ss);
//		}

	}

}
