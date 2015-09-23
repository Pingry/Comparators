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


// I used a bubble sort here because I figured why not, also I had to remake it and I was
// most confident writing this one
	public void sort()
	{
		for (int i=0; i<items.size()-1; i++)
		{
			for (int j=0; j<items.size()-(i+1); j++)
			{
				if (comparator.compare(items.get(j),items.get(j+1))>0)
					items.set((j+1), items.set(j,items.get(j+1)));
			}
			
		}
	}

}