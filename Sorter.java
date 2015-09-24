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

	public void sort()
	{
		for (int i = 0; i < items.size(); i++)
		{
			for(int j = 0; j < items.size() - 1; j++)
			{
				if (comparator.compare(items.get(j), items.get(j + 1)) < 0)
				{
					E holder = items.get(j);
					items.set(j, items.get(j + 1));
					items.set(j + 1, holder);
				}
					
			}
		
		}

	}

}