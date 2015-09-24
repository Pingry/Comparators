
public class CustomerPriorityComparator implements Comparator<CustomerRecord>{
	public int comparePriority(CustomerRecord accountA, CustomerRecord accountB) {
		/*Returns a number less than zero if the first account has a priority 
		 * number less than the second, zero if they are the same, and a 
		 * number greater than zero if the first priority number 
		 * is greater than the second's */
		return accountA.getPriority() - accountB.getPriority();
	}
	
	public boolean equals (PriorityComparator pc) {
		if (this.equals(pc)) return true;
		return false;
	}
}
