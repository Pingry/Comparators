
public class CustomerRecord
{
	private int account_num;
	private double amount_owed;
	private int priority;

	private static int next_account_num = 1;

	public CustomerRecord()
	{
		account_num = next_account_num;
		next_account_num++;
		amount_owed = 0.0;
		priority = 10;
	}


	public void setPriority(int new_priority) { priority = new_priority; }

	public int getPriority() { return priority; }

	public void applyMoney(double amount) { amount_owed -= amount; }

	public int getAccountNum () { return account_num; }

	public static CustomerRecord generateRandomRecord()
	{
		double random = (Math.random() * 1000000) * -1;
		CustomerRecord cr = new CustomerRecord();
		cr.applyMoney(random);
		cr.setPriority((int) (Math.random() * 10) + 1);
		return cr;

	}

}