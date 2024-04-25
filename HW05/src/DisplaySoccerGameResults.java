public class DisplaySoccerGameResults

{

	public static void main(String[] args)

	{

		SoccerGameScoreBoard machesterUnited = new SoccerGameScoreBoard("Machester United", 3, 1, 5);

		SoccerGameScoreBoard liverpool = new SoccerGameScoreBoard("Liverpool", 3, 1, 4);

		SoccerGameResults results = grabGameResults(machesterUnited, liverpool);

		printResults(results);

		/*
		 * create two more teams by using constructor chaining (create an abject with
		 * only the team name, and the rest of the fields of the object should get
		 * initialized in constructor chaining with the read method) and display the
		 * result in the same way as did with liverpool and machesterUnited
		 */

		SoccerGameScoreBoard team1 = new SoccerGameScoreBoard("Team 1");
		SoccerGameScoreBoard team2 = new SoccerGameScoreBoard("Team 2");

		printResults(grabGameResults(team1, team2));
	}

	public static SoccerGameResults grabGameResults(SoccerGameScoreBoard team1, SoccerGameScoreBoard team2)

	{
		SoccerGameResults results = new SoccerGameResults();
		results.wonByGoalsInMatch = team1.goalsInMatch != team2.goalsInMatch;
		results.wonByGoalsInExtraTime = !results.wonByGoalsInMatch && team1.goalsInExtraTime != team2.goalsInExtraTime;
		results.wonByGoalsInPenaltyShootOut = !results.wonByGoalsInPenaltyShootOut
				&& team1.goalsInPenaltyShootOut != team2.goalsInPenaltyShootOut;

		if (results.wonByGoalsInMatch)
			results.sWinnerTeam = team1.goalsInMatch > team2.goalsInMatch ? team1.sTeamName : team2.sTeamName;
		else if (results.wonByGoalsInExtraTime)
			results.sWinnerTeam = team1.goalsInExtraTime > team2.goalsInExtraTime ? team1.sTeamName : team2.sTeamName;
		else if (results.wonByGoalsInPenaltyShootOut)
			results.sWinnerTeam = team1.goalsInPenaltyShootOut > team2.goalsInPenaltyShootOut ? team1.sTeamName
					: team2.sTeamName;
		else
			results.sWinnerTeam = team1.sTeamName;

		results.sLoserTeam = team1.sTeamName.equals(results.sWinnerTeam) ? team2.sTeamName : team1.sTeamName;

		return results;
	}

	public static void printResults(SoccerGameResults results) {
		if (results.wonByGoalsInMatch)

		{

			System.out.println(
					results.sWinnerTeam + " vs " + results.sLoserTeam + "and the winner is " + results.sWinnerTeam);

		}

		else if (results.wonByGoalsInExtraTime)

		{

			System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + "and the winner is "
					+ results.sWinnerTeam + " in Extra Time");

		}

		else if (results.wonByGoalsInPenaltyShootOut)

		{

			System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + "and the winner is "
					+ results.sWinnerTeam + " in Penalty Shootout");

		}

		else

		{

			System.out.println(results.sWinnerTeam + " vs " + results.sLoserTeam + "and ended with tie");

		}
	}

}