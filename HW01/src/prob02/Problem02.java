package prob02;

// I renamed the class to Problem02, not a problem, was just bothering me.
public class Problem02
// ideally would be moved beside class name, but is technically fine here.
{
	// String is a class, so it has to be capitalized, string is not recognized.
	// no problem using [ ] instead of [], it just isn't standard.
//  public static void main(string args[ ])
	public static void main(String args[])

	// ideally would be moved up beside main() but it is technically fine to put the { here.
	{
		// initialization of multiple arguments requires at least two lines, one to declare
		// and one to assign. Secondly, you cannot have multiple 
		// type declaration in the same statement
//		int double a=b=c=d=0.0;
		double a, b, c, d;
		a = b = c = d = 0.0;
		
		// typo here, should be println not printIn, otherwise fine.
//		System.out.printIn("a = " +a+ "\nb = " +b+ "\nc = "+c+"\nd = "+d);
		System.out.println("a = " +a+ "\nb = " +b+ "\nc = "+c+"\nd = "+d);
	}

}