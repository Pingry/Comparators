import java.util.Comparator;

public class CustomerRecordComparator implements Comparator<CustomerRecord>
{
      //Returns a positive number if customer 1's priority is higher than customer 2's priority
      //Returns 0  if customer 1's priority is the same as customer 2's priority
      //Returns a negative number if customer 1's priority is lower than customer 2's priority
      public int compare (CustomerRecord c1, CustomeRecord c2)
      {
          return c1.getPriority() - c2.getPriority();
      }
      
      public boolean equals (CustomerRecord c1, CustomerRecord c2)
      {
            return c1.getPriority()==c2.getPriority();
      }
  
}
