import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DraftKings {

	public static void run(){
		ArrayList<BasketballTeam> listofteams = new ArrayList<BasketballTeam>();


    	File filename = FileFinder.GetFile();
    	int sport = GetSport.WhichSport();
        String line = "";
        String cvsSplitBy = ",";
        int i = 0;
        switch(sport){
        case(0):
            BasketballTeam bestBasketballteam;

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

                while ((line = br.readLine()) != null) {

                    String[] player = line.split(cvsSplitBy);
                    if(i !=0){
                        double salary = Double.parseDouble(player[2]);
                        double avgpoints = Double.parseDouble(player[4]);
                        Player x = new Player(player[0],player[1],salary , avgpoints , player[5]);
                        BasketballTeam.listofplayers.add(x);
                    }
                    i++;                
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            BasketballTeam.putintoPositionList();
            bestBasketballteam = BasketballTeam.getRandomTeam();
        	int points = (int)bestBasketballteam.GetTeamScore();
        	int y = 0;
        	System.out.println("Finding you a great team...");
        	long start = System.currentTimeMillis();
        	long end = start + 3*1000; // 60 seconds * 1000 ms/sec
        	while(System.currentTimeMillis() < end){//bestteam.GetTeamScore()<points & <<<should i put this is while loop?
        		y++;
            	BasketballTeam indexTeam = BasketballTeam.getRandomTeam();
            	if(bestBasketballteam.GetTeamScore() <= indexTeam.GetTeamScore() && indexTeam.GetTeamSalary()<= 50000 && BasketballTeam.isDuplicate(indexTeam) == false){ //checkduplicates(indexTeam) == false
            		bestBasketballteam = indexTeam;
            		points = (int)bestBasketballteam.GetTeamScore()+2;
            	}        	
            }
            
            System.out.println("Best Team Score: " + bestBasketballteam.GetTeamScore());
            System.out.println("Best Team Salary: " + bestBasketballteam.GetTeamSalary());
            System.out.println();
            BasketballTeam.printTeam(bestBasketballteam);
            System.out.println("tried " + y + " different combinations");
            break;
        case(1):
        	 GolfTeam bestGolfTeam;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine()) != null) {

                String[] player = line.split(cvsSplitBy);
                if(i !=0){
                    double salary = Double.parseDouble(player[2]);
                    double avgpoints = Double.parseDouble(player[4]);
                    Player x = new Player(player[0],player[1],salary , avgpoints , player[5]);
                    GolfTeam.listofgolfers.add(x);
                }
                i++;                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        bestGolfTeam = GolfTeam.getRandomTeam();
    	points = (int)bestGolfTeam.GetTeamScore();
    	y = 0;
    	System.out.println("Finding you a great team...");
    	start = System.currentTimeMillis();
    	end = start + 3*1000; // 60 seconds * 1000 ms/sec
    	while(System.currentTimeMillis() < end){//bestteam.GetTeamScore()<points & <<<should i put this is while loop?
    		y++;
        	GolfTeam indexTeam = GolfTeam.getRandomTeam();
        	if(bestGolfTeam.GetTeamScore() <= indexTeam.GetTeamScore() && indexTeam.GetTeamSalary()<= 50000 && GolfTeam.isDuplicate(indexTeam) == false){ //checkduplicates(indexTeam) == false
        		bestGolfTeam = indexTeam;
        		points = (int)bestGolfTeam.GetTeamScore()+2;
        	}        	
        }
        
        System.out.println("Best Team Score: " + bestGolfTeam.GetTeamScore());
        System.out.println("Best Team Salary: " + bestGolfTeam.GetTeamSalary());
        System.out.println();
        GolfTeam.printTeam(bestGolfTeam);
        System.out.println("tried " + y + " different combinations");
        	break;
        case(2):
        	BaseballTeam bestBaseBallTeam;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine()) != null) {

                String[] player = line.split(cvsSplitBy);
                if(i !=0){
                    double salary = Double.parseDouble(player[2]);
                    double avgpoints = Double.parseDouble(player[4]);
                    Player x = new Player(player[0],player[1],salary , avgpoints , player[5]);
                    BaseballTeam.listofplayers.add(x);
                }
                i++;                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        BaseballTeam.putintoPositionList();
        bestBaseBallTeam = BaseballTeam.GetRandomTeam();

    	points = (int)bestBaseBallTeam.GetTeamScore();
    	y = 0;
    	System.out.println("Finding you a great team...");
    	start = System.currentTimeMillis();
    	end = start + 3*1000; // 60 seconds * 1000 ms/sec
    	while(System.currentTimeMillis() < end){//bestteam.GetTeamScore()<points & <<<should i put this is while loop?
    		y++;
        	BaseballTeam indexTeam = BaseballTeam.GetRandomTeam();
        	if(bestBaseBallTeam.GetTeamScore() <= indexTeam.GetTeamScore() && indexTeam.GetTeamSalary()<= 50000 && BaseballTeam.isDuplicate(indexTeam) == false){ //checkduplicates(indexTeam) == false
        		bestBaseBallTeam = indexTeam;
        		points = (int)bestBaseBallTeam.GetTeamScore();
        	}        	
        }
        
        System.out.println("Best Team Score: " + bestBaseBallTeam.GetTeamScore());
        System.out.println("Best Team Salary: " + bestBaseBallTeam.GetTeamSalary());
        System.out.println();
        BaseballTeam.printTeam(bestBaseBallTeam);
        System.out.println("tried " + y + " different combinations");
        break;
        }        
    }
	

	}


