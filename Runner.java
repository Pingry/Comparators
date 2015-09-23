// Zachary Keller
// 9/22/15
// The runner for my new comparator project, I used this to make sure
// everything was running smoothly
import java.util.ArrayList;

public class Runner
{

//I go through declaring and instantiating all of the necessary steps to make sure the
//comparator and sorter work. Here I used a set of Random CustomerRecords of size 10,
//but obviously it works for any number.
	public static void main (String [] args)
	{
		CustomerRecord c= new CustomerRecord();
		ArrayList<CustomerRecord> l = new ArrayList<CustomerRecord>();
		for (int x=0; x<10; x++)
			l.add(c.generateRandomRecord());
/* What I used to make sure it worked:
		for (int k=0; k<l.size(); k++)
			System.out.println(l.get(k).getPriority());
		System.out.println(" ");
*/
			
		PriorityComp comp=new PriorityComp();
		Sorter<CustomerRecord> s= new Sorter<CustomerRecord>(l, comp);
		s.sort();
/*
		for (int k=0; k<l.size(); k++)
			System.out.println(l.get(k).getPriority());
*/
	}



}