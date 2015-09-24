import java.util.Comparator;
public class CustomerRecordComparator implements Comparator<CustomerRecord>
{
	public int compare(CustomerRecord A, CustomerRecord B)//returns neg if A is higher 
	//priority and returns 0 if records are same priority and returns positive 
	//if B is higher priority
	{
		return A.getPriority() - B.getPriority();
				
	}
	
	public boolean equal(int accnum)//returns if the accounts in question are the same one
	{
		return CustomerRecord.getAccountNum() == accnum;
	}
	
	
}