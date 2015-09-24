import java.util.ArrayList;

public class Runner
{
	public static void main(String[] args)
	{
		int length = 100;
		ArrayList<CustomerRecord> list = new ArrayList<CustomerRecord>();
		for (int i = 0; i < length; i++)
			list.add(CustomerRecord.generateRandomRecord());
		Sorter<CustomerRecord> sort = new Sorter<CustomerRecord>(list, new AmountOwedComparator());
		sort.sort();
		for (int i = 0; i < length; i++)
			System.out.println(list.get(i));
		
	}
}