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
		ArrayList<E> sortedItems = new ArrayList<E>(items.size());
		//Insert your favorite sorting algorithm here
		int length = items.size();
		for (int i = 0; i < length; i++) {
			int smallestItemIndex;
			for (int j = 0; j < items.size(); j++) {
				if (comparator.comparePriority(items.get(smallestItemIndex), items.get(j)) <= 0) {
					smallestItemIndex = j;
				}
			}
			sortedItems.add(items.remove(j));
			smallestItemIndex = 0;
		}
	}

}