package collection;

import java.util.Comparator;


	public class NewCompare implements Comparator{
		
		public int compare(Object obj1, Object obj2) {
			if(obj1.equals("Bisamrk")) {
				
				return -1;
				
			}
			
			return(((String) obj1).compareTo((String) obj2));
		}
}
