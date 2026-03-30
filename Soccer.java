import java.util.*;
import java.io.*;


public class Soccer
{
public static boolean containsTeam(ArrayList<Team> teams, String namePassed)
{
for (int i = 0; i < teams.size(); ++i)
{
if (teams.get(i).getName().equals(namePassed))
return true;
}
return false;
}

public static Team getTeam(ArrayList<Team> teams, String namePassed)
{
for (int i = 0; i < teams.size(); ++i)
{
if (teams.get(i).getName().equals(namePassed))
return teams.get(i);
}
return null;
}



public static void main(String[] args) {
Scanner inputStream = null;

ArrayList<Team> teams = new ArrayList<>();

try{
inputStream = new Scanner(new FileInputStream("results.txt"));
}

catch(FileNotFoundException e)
{
System.out.println("Issue opening the file, program will close.");
System.exit(0);
}


while(inputStream.hasNextLine())
{
String teamName1 = inputStream.next();
int teamScore1 = inputStream.nextInt();
String teamName2 = inputStream.next();
int teamScore2 = inputStream.nextInt();
Team team1,team2;

if(containsTeam( teams ,teamName1 ))
team1 = getTeam(teams , teamName1);
else {
team1 = new Team(teamName1);
teams.add(team1);
} 

if(containsTeam(teams , teamName2))
team2 = getTeam(teams, teamName2);
else {
team2 = new Team(teamName2);
teams.add(team2);
} 

if (teamScore1 > teamScore2)
{
team1.addWin();
team2.addLoss();
} 
else if (teamScore1 < teamScore2) 
{
team1.addLoss();
team2.addWin();
}

inputStream.nextLine();
}

inputStream.close();


Team[] nameAlpha = teams.toArray(new Team[0]);
Arrays.sort(nameAlpha);
System.out.printf("%-10s%-10s%-10s\n", "Teams" , "Wins" , "Losses");
for (Team team: teams)
System.out.printf("%-10s%-10d%-10d\n", team.getName() , team.getWins() , team.getLosses());


inputStream.close();

}
}
