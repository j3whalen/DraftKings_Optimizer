import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GolfTeam {
	public static ArrayList<Player> listofgolfers = new ArrayList<Player>();
	
	private Player G1;
	private Player G2;
	private Player G3;
	private Player G4;
	private Player G5;
	private Player G6;
	
	public GolfTeam(Player G1, Player G2, Player G3, Player G4, Player G5, Player G6){
		this.G1 = G1;
		this.G2 = G2;
		this.G3 = G3;
		this.G4 = G4;
		this.G5 = G5;
		this.G6 = G6;
	}
    public static void printTeam(GolfTeam x){
		System.out.println(x.getG1().getName() +" "+ x.getG1().getPosition()+ " points:  " + x.getG1().getAvgpoints() + " Salary: " + x.getG1().getSalary());
		System.out.println(x.getG2().getName() +" "+ x.getG2().getPosition()+ " points:  " + x.getG2().getAvgpoints() + " Salary: " + x.getG2().getSalary());
		System.out.println(x.getG3().getName() +" "+ x.getG3().getPosition()+ " points:  " + x.getG3().getAvgpoints() + " Salary: " + x.getG3().getSalary());
		System.out.println(x.getG4().getName() +" "+ x.getG4().getPosition()+ " points:  " + x.getG4().getAvgpoints() + " Salary: " + x.getG4().getSalary());
		System.out.println(x.getG5().getName() + " "+x.getG5().getPosition()+ " points:  " + x.getG5().getAvgpoints() + " Salary: " + x.getG5().getSalary());
		System.out.println(x.getG6().getName() +" "+ x.getG6().getPosition()+ " points:  " + x.getG6().getAvgpoints() + " Salary: " + x.getG6().getSalary());
		
}

    public static GolfTeam getRandomTeam(){
    	int x = listofgolfers.size();
		int G1number = ThreadLocalRandom.current().nextInt(1, x);
		Player G1 = listofgolfers.get(G1number);
		int G2number = ThreadLocalRandom.current().nextInt(1, x);
		Player G2 = listofgolfers.get(G2number);
		int G3number = ThreadLocalRandom.current().nextInt(1, x);
		Player G3 = listofgolfers.get(G3number);
		int G4number = ThreadLocalRandom.current().nextInt(1, x);
		Player G4 = listofgolfers.get(G4number);
		int G5number = ThreadLocalRandom.current().nextInt(1, x);
		Player G5 = listofgolfers.get(G5number);
		int G6number = ThreadLocalRandom.current().nextInt(1, x);
		Player G6 = listofgolfers.get(G6number);
		GolfTeam team = new GolfTeam(G1, G2, G3, G4, G5, G6);
		return team;
    }
    
	static public boolean isDuplicate(GolfTeam list){
		ArrayList<Player> newlist = getListofPlayers(list);
		boolean isDuplicate = false;
		String[] listofnames = new String[newlist.size()];
		for(int i = 0; i < newlist.size(); i++){
			listofnames[i] = newlist.get(i).getName();	
		}
        List inputList = Arrays.asList(listofnames);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()){
            isDuplicate =  true;            
        }
        return isDuplicate;
    }
	static private ArrayList<Player> getListofPlayers(GolfTeam indexlist){
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(indexlist.getG1());
		list.add(indexlist.getG2());
		list.add(indexlist.getG3());
		list.add(indexlist.getG4());
		list.add(indexlist.getG5());
		list.add(indexlist.getG6());
		return list;
		
	}
	public double GetTeamSalary(){
		return G1.getSalary() + G2.getSalary() + G3.getSalary() + G4.getSalary() + G5.getSalary()+ G6.getSalary();
	}
	public double GetTeamScore(){
		return G1.getAvgpoints() + G2.getAvgpoints() + G3.getAvgpoints() + G4.getAvgpoints() + G5.getAvgpoints()+ G6.getAvgpoints();
	}

	public Player getG1() {
		return G1;
	}

	public Player getG2() {
		return G2;
	}

	public Player getG3() {
		return G3;
	}

	public Player getG4() {
		return G4;
	}

	public Player getG5() {
		return G5;
	}

	public Player getG6() {
		return G6;
	}
    


}
