class Prime
{
	public static void main( String[] args)
	{
	}

	public static boolean isPrime(int n)
	{
		for (int i = 2; i <= n/2; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}