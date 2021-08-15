package problem001;
import java.util.*; 
public class removeduplicate 
{
	public static void main(String[] args)
 	{
			// Creating a list of Integer
      		 List<Integer> aList = Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8);
      		 System.out.println("list With Duplicates="+aList);
        		Set<Integer> hSet = new HashSet<Integer>();
        		for (Integer x : aList)
        		{
            			hSet.add(x);
        		}
        		System.out.println("A list Without Duplicates");
        		for (Integer x : hSet)
        		{
            			System.out.println( x);
  
        		}        
    }
}
