import java.util.Comparator;
public class compareCustomerRecord implements Comparator<CustomerRecord>
{
	public int compare(CustomerRecord a, CustomerRecord b)
+	{
+		int acc1 = a.getPriority();
+		int acc2 = b.getPriority();
+		return acc1 - acc2;
+	}
	public equalPriority compare(CustomerRecord a, CustomerRecord b)
	{
		return a.getPriority()==b.getPriority();
	}
}
