import java.util.Scanner;

public class SoccerGameScoreBoard

{

	static int numTeams;
	
	static {
		numTeams = 0;
	}
	
	String sTeamName;

	int goalsInMatch;

	int goalsInExtraTime;

	int goalsInPenaltyShootOut;

	/*
	 * include constructor chaining so that you can create an abject with only the
	 * team name, later
	 * 
	 * in chaining, you can use a read method to read the rest of the field value
	 * 
	 * hint: while calling the next constructor, you can place a call to read
	 * function as
	 * 
	 * argument in the constructor call
	 * 
	 */

	SoccerGameScoreBoard(String sTeamName, int goalsInMatch, int goalsInExtraTime, int goalsInPenaltyShootOut)

	{

		this.sTeamName = sTeamName;

		this.goalsInMatch = goalsInMatch;

		this.goalsInExtraTime = goalsInExtraTime;

		this.goalsInPenaltyShootOut = goalsInPenaltyShootOut;

	}
	
	SoccerGameScoreBoard(String teamName) {
		this(teamName, read("goals in match"), read("goals in extra time"), read("goals in penalty shoot out"));
	}
	
	public static int read(String name) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many "+name + ": ");
		return input.nextInt();
	}

	@Override

	public String toString() {

		return "SoccerGameScoreBoard [sTeamName=" + sTeamName + ", goalsInMatch=" + goalsInMatch + ", goalsInExtraTime="

				+ goalsInExtraTime + ", goalsInPenaltyShootOut=" + goalsInPenaltyShootOut + "]";

	}

}
