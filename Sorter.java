public class Sorter<E>
{
	private ArrayList<E> items;
	private Comparator<E> comparator;

	public class Sorter(ArrayList<E> i, Comparator<E> c)
	{
		this.items = i;
		this.comparator = c;
	}	

	public void sort()
	{
		//Inster your favorite sorting algorithm here

	}

}