# Comparators
For this assignment, create a Comparator that does a useful comparison on the CustomerRecord class provided. Optionally, you can finish the Sorter.java class and actually use your comparator to sort a large list. Use the generateRandomRecord method in CustomerRecord to help.

public class AmountOwedComparator implements Comparator<Customer Record>
{
  public int compare(Customer Record cr1, Customer Record cr2)
  {
    return cr1.getAmountOwed()-cr2.getAmountOwed();
  }
}
