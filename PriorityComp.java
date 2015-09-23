// Zachary Keller
// 9/22/15
// My Comparator for the priority of a Customer Record
import java.util.Comparator;

public class PriorityComp implements Comparator<CustomerRecord>
{

	//my compare function compares the CustomerRecords based on their priority
	public int compare(CustomerRecord a, CustomerRecord b)
	{
		if (a.getPriority()>b.getPriority())
			return 1;
		else if (b.getPriority()>a.getPriority())
			return -1;
		else
			return 0;
	}
	
	//I remember you said in class that it was not important what we did for this
	// So I just had it return true all the time, because I do not totally understand
	// how it works
	public boolean equals(CustomerRecord c)
	{
		return true;
	}

}