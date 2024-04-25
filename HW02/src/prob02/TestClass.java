package prob02;

public class TestClass

{

	public static void main(String[] args)

	{

		System.out.println("What is it printing?\nExplain the problem it is solving.");
		// prints all factors of 2 between 1 and 999 inclusively.
		for (int i = 1; i < 1000; i++)
			// checks if the number is a factor of 2.
			if (testOne(i))
				// prints the number if factor of 2.
				System.out.println(i);

		System.out.println("What is it printing?\nExplain the problem it is solving.");
		// checks within 1 and 19 inclusively.
		for (int i = 1; i < 20; i++)
			
			System.out.println(testTwo(i));

		System.out.println("What is it printing?\nExplain the problem it is solving.");
		// creates an array of integers.
		int[] iHaveSomething = new int[] { 22, 33, 44 };
		// prints all possible combinations of iHaveSomething
		testThree(iHaveSomething);

	}

	// What is the purpose of this method?
	/**
	 * 
	 * @param hasSomething
	 * @return true if the number is a factor of 2.
	 */
	static boolean testOne(int hasSomething)

	{

		// Explain the following code with an example here
		
		// The left hand side of the AND is checking whether the supplied number is 0
	
		// The right side of the and is checking whether the supplied number
		// is a factor of 2.
		
		//   8 - 1000  |   5 - 0101
		// & 7 - 0111  | & 4 - 0100
		// ----------  | ----------
		// TRUE  0000  | FALSE 0100      
		return hasSomething != 0 && ((hasSomething & (hasSomething - 1)) == 0);

	}

	// What is the purpose of this method?
	/**
	 * popcount
	 * @param whoAmI
	 * @return How many 1s are in the binary form of the supplied number.
	 */
	static int testTwo(int whoAmI)

	{

		int whatIamDoing = 0;

		// What this loop is doing?
		/*
		 * This loop is counting the number of 1s in the
		 * supplied number's (whoAmI) binary form.
		 * whatIamDoing is being used to store the number of 1s
		 * counted.
		 */
		while (whoAmI != 0)

		{
			whoAmI = whoAmI & (whoAmI - 1);

			whatIamDoing++;

		}

		// What is returned here to the caller?
		// the number of 1s in whoAmI
		return whatIamDoing;

	}

	// What is the purpose of this method?
	/**
	 * Prints every possible combination of elements in the provided array.
	 * @param iHaveSomething
	 */
	public static void testThree(int[] iHaveSomething)

	{
		// howMany is the size of the supplied array.
		int howMany = iHaveSomething.length;

		// How long does this loop run? Why this nested loop is implemented?
		// this loop runs 2^howMany times.
		for (int i = 0; i < (1 << howMany); i++)

		{
			// this loop runs howMany times.
			for (int j = 0; j < howMany; j++)

			{

				// What actually is this if statement checking?
				// checks if the jth bit of i is set to 1.
				if ((i & (1 << j)) != 0)

				{

					System.out.print(iHaveSomething[j] + " ");

				}

			}

			System.out.println();

		}

	}

}
