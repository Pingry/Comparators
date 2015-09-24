import java.util.Comparator;

public class AmountOwedComparator implements Comparator<CustomerRecord>
{

	public int compare(CustomerRecord cr1, CustomerRecord cr2)
	{
		return (int)(cr1.getAmountOwed() - cr2.getAmountOwed());
	}
	
	public boolean equals(CustomerRecord cr1, CustomerRecord cr2)
	{
		if (cr1.getAmountOwed() == cr2.getAmountOwed())
			return true;
		return false;
	}

}