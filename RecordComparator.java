public class RecordComparator implements Comparator<CustomerRecord>
{
	public int compare(CustomerRecord cr1, CustomerRecord cr2)
	{
		return cr1.getPriority()-cr2.getPriority();
	}
	
	public boolean equals(CustomerRecord cr1)
	{
		return this.getPriority()==cr1.getPriority();
	}
}
