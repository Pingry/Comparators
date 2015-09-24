import java.util.ArrayList;
import java.util.Comparator;

public class Sorter<E>
{
	private ArrayList<E> items;
	private Comparator<E> comparator;

	public Sorter(ArrayList<E> i, Comparator<E> c)
	{
		this.items = i;
		this.comparator = c;
	}	
	//Arranges the ArrayList items in order from smallest to largest in the items copy ArrayList 
	//using the compare method. itemsCopy then replaces items
	public void sort()
	{
		//Inster your favorite sorting algorithm here
		ArrayList<E> itemsCopy = new ArrayList<E>(items.size());
		int holder = 0;
		for(int i=0; i<itemsCopy.size(); i++)
		{
			for(int j=0; j<items.size(); i++)
			{
				if(comparator.compare(items.get(i), items.get(holder))>0)
				{
					holder = j;
				}
			}
			
			itemsCopy.add(items.remove(holder));
		}
		items=itemsCopy;

	}

}
