import java.util.*; 			//gets rid of Comparable errors, imports it? also imports ArrayList.

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
		//Insertion sort -- get familiar!
		for ( int i = 1; i < items.size(); i++ )
		{
			E element = items.get(i);
			int j;
			for ( j = i - 1; j >= 0 && element.compare( items.get( j ) ) < 0; j-- )
			{
				items.set( j + 1, items.get( j ) );		//is this the correct set command?
				items.set( j, element );
			}
		}

	}

}
