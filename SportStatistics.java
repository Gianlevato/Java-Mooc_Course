
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What file?");
        String file = scan.nextLine();
        System.out.println("What team?");
        String team = scan.nextLine();
        
        ArrayList<Game> games = createGameData(file);
        
        int teamNum = 0;
        int teamWins = 0;
        int teamLoss = 0;
        
        for(Game gameData: games) {
            String hTeam = gameData.getHTeam();
            String aTeam = gameData.getATeam();
            int hScore = gameData.getHScore();
            int aScore = gameData.getAScore();
            if (team.equals(hTeam) || team.equals(aTeam)) {
                teamNum +=1;
            }
            String winner = "";
            if (hScore > aScore) {
                winner = hTeam;
                teamWins +=1;
            }
            if (hScore < aScore) {
                winner = aTeam;
                teamLoss +=1;
            }
            
        }
        System.out.println("Games: " + teamNum);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLoss);
    }
    public static ArrayList<Game> createGameData(String fileName) {
        ArrayList<Game> gameData = new ArrayList();
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
              String[] parts = row.split(",");
              String team1 = parts[0];
              String team2 = parts[1];
              int team1Points = Integer.valueOf(parts[2]);
              int team2Points = Integer.valueOf(parts[3]); 
              
              gameData.add(new Game(team1, team2, team1Points, team2Points));
                
            }
        }
        catch (Exception E) {
            
        }
        return gameData;
    }
}
