import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BasketballTeam {
	public static ArrayList<Player> listofplayers = new ArrayList<Player>();
	
	public static ArrayList<Player> listofCenters = new ArrayList<Player>();
	public static ArrayList<Player> listofforwards = new ArrayList<Player>();
	public static ArrayList<Player> listofguards = new ArrayList<Player>();

	private Player PG;
	private Player SG;
	private Player SF;
	private Player PF;
	private Player C;
	private Player G;
	private Player F;
	private Player UTIL;
	private double teamscore;
	
	public BasketballTeam(Player PG, Player SG, Player SF, Player PF, Player C, Player G, Player F, Player UTIL){
		this.PG = PG;
		this.SG = SG;
		this.SF = SF;
		this.PF = PF;
		this.C = C;
		this.G = G;
		this.F = F;
		this.UTIL = UTIL;
		
	}
    public static void printTeam(BasketballTeam x){
		System.out.println(x.getF().getName() +" "+ x.getF().getPosition()+ " points:  " + x.getF().getAvgpoints() + " Salary: " + x.getF().getSalary());
		System.out.println(x.getC().getName() +" "+ x.getC().getPosition()+ " points:  " + x.getC().getAvgpoints() + " Salary: " + x.getC().getSalary());
		System.out.println(x.getG().getName() +" "+ x.getG().getPosition()+ " points:  " + x.getG().getAvgpoints() + " Salary: " + x.getG().getSalary());
		System.out.println(x.getPF().getName() +" "+ x.getPF().getPosition()+ " points:  " + x.getPF().getAvgpoints() + " Salary: " + x.getPF().getSalary());
		System.out.println(x.getSF().getName() + " "+x.getSF().getPosition()+ " points:  " + x.getSF().getAvgpoints() + " Salary: " + x.getSF().getSalary());
		System.out.println(x.getPG().getName() +" "+ x.getPG().getPosition()+ " points:  " + x.getPG().getAvgpoints() + " Salary: " + x.getPG().getSalary());
		System.out.println(x.getSG().getName() +" "+ x.getSG().getPosition()+ " points:  " + x.getSG().getAvgpoints() + " Salary: " + x.getSG().getSalary());
		System.out.println(x.getUTIL().getName() +" "+ x.getUTIL().getPosition()+ " points:  " + x.getUTIL().getAvgpoints() + " Salary: " + x.getUTIL().getSalary());

		
}
    public static void putintoPositionList(){
    	for(Player player: listofplayers){
    	if(player.getPosition().contains("G")){
    		listofguards.add(player);
    		
    	}
    	if (player.getPosition().contains("F")){
    		listofforwards.add(player);
    	}
    	if (player.getPosition().contains("C")){
    		listofCenters.add(player);
    	}
    	}
    }
    public static BasketballTeam getRandomTeam(){
		int centersnumber = ThreadLocalRandom.current().nextInt(1, listofCenters.size() );
		Player center = listofCenters.get(centersnumber);
		int gaurdsnumber = ThreadLocalRandom.current().nextInt(1, listofguards.size() );
		Player gaurd = listofguards.get(gaurdsnumber);
		int gaurdsnumber2 = ThreadLocalRandom.current().nextInt(1, listofguards.size() );
		Player gaurd2 = listofguards.get(gaurdsnumber2);
		int gaurdsnumber3 = ThreadLocalRandom.current().nextInt(1, listofguards.size() );
		Player gaurd3 = listofguards.get(gaurdsnumber3);
		int forwardsnumber = ThreadLocalRandom.current().nextInt(1, listofforwards.size() );
		Player forward = listofforwards.get(forwardsnumber);
		int forwardsnumber2 = ThreadLocalRandom.current().nextInt(1, listofforwards.size() );
		Player forward2 = listofforwards.get(forwardsnumber2);
		int forwardsnumber3 = ThreadLocalRandom.current().nextInt(1, listofforwards.size() );
		Player forward3 = listofforwards.get(forwardsnumber3);
		int x  = ThreadLocalRandom.current().nextInt(1, 4);
		//team(Player PG, Player SG, Player SF, Player PF, Player C, Player G, Player F, Player UTIL)
    	BasketballTeam topteam = null;

		if (x == 1){
    		int forwardsnumber4 = ThreadLocalRandom.current().nextInt(1, listofforwards.size() );
    		Player Extraforward = listofforwards.get(forwardsnumber4);

	    	 topteam = new BasketballTeam(gaurd, gaurd2, forward, forward2, center,gaurd3,forward3,Extraforward);    			
		}
		if (x == 2){
    		int gaurdsnumber4 = ThreadLocalRandom.current().nextInt(1, listofguards.size() );
    		Player Extragaurd = listofguards.get(gaurdsnumber4);

	    	 topteam = new BasketballTeam(gaurd, gaurd2, forward, forward2, center,gaurd3,forward3,Extragaurd);    			
		}
		if (x == 3){
    		int Centersnumber = ThreadLocalRandom.current().nextInt(1, listofCenters.size());
    		Player ExtraCenter = listofforwards.get(Centersnumber);

    		topteam = new BasketballTeam(gaurd, gaurd2, forward, forward2, center,gaurd3,forward3,ExtraCenter);    			
		}  
		return topteam;
}
	public double GetTeamScore(){
		return PG.getAvgpoints() + SG.getAvgpoints() + SF.getAvgpoints() + PF.getAvgpoints() + C.getAvgpoints()+ G.getAvgpoints()+F.getAvgpoints() + UTIL.getAvgpoints();
	}
	
	public double GetTeamSalary(){
		return PG.getSalary() + SG.getSalary() + SF.getSalary() + PF.getSalary() + C.getSalary()+ G.getSalary()+F.getSalary() + UTIL.getSalary();
	}

	public Player getPG() {
		return PG;
	}

	public void setPG(Player pG) {
		PG = pG;
	}

	public Player getSG() {
		return SG;
	}

	public void setSG(Player sG) {
		SG = sG;
	}

	public Player getSF() {
		return SF;
	}

	public void setSF(Player sF) {
		SF = sF;
	}

	public Player getPF() {
		return PF;
	}

	public void setPF(Player pF) {
		PF = pF;
	}

	public Player getC() {
		return C;
	}

	public void setC(Player c) {
		C = c;
	}

	public Player getG() {
		return G;
	}

	public void setG(Player g) {
		G = g;
	}

	public Player getF() {
		return F;
	}

	public void setF(Player f) {
		F = f;
	}

	public Player getUTIL() {
		return UTIL;
	}

	public void setUTIL(Player uTIL) {
		UTIL = uTIL;
	}

	public void setTeamscore(double teamscore) {
		this.teamscore = teamscore;
	}
	static private ArrayList<Player> getListofPlayers(BasketballTeam indexlist){
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(indexlist.getC());
		list.add(indexlist.getF());
		list.add(indexlist.getPG());
		list.add(indexlist.getSG());
		list.add(indexlist.getSF());
		list.add(indexlist.getG());
		list.add(indexlist.getPF());
		list.add(indexlist.getUTIL());
		return list;
		
	}
	static public boolean isDuplicate(BasketballTeam list){
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



	

}
