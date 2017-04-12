import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BaseballTeam {
	public static ArrayList<Player> listofplayers = new ArrayList<Player>();
	public static ArrayList<Player> shuffledlistofplayers = new ArrayList<Player>();

	
	public static ArrayList<Player> listofpitchers = new ArrayList<Player>();
	public static ArrayList<Player> listofcatchers = new ArrayList<Player>();
	public static ArrayList<Player> listof1B = new ArrayList<Player>();
	public static ArrayList<Player> listof2B = new ArrayList<Player>();
	public static ArrayList<Player> listof3B = new ArrayList<Player>();
	public static ArrayList<Player> listofSS = new ArrayList<Player>();
	public static ArrayList<Player> listofOF = new ArrayList<Player>();
	
	private Player P;
	private Player P2;
	private Player C;
	private Player B1;
	private Player B2;
	private Player B3;
	private Player SS;
	private Player OF1;
	private Player OF2;
	private Player OF3;
	
	public BaseballTeam(Player P, Player P2, Player C, Player B1, Player B2, Player B3, Player SS, Player OF1, Player OF2, Player OF3){
		this.P = P;
		this.P2 = P2;
		this.C = C;
		this.B1 = B1;
		this.B2 = B2;
		this.B3 = B3;
		this.SS = SS;
		this.OF1 = OF1;
		this.OF2 = OF2;
		this.OF3 = OF3;


		
	}
    public static void printTeam(BaseballTeam x){
		System.out.println(x.getP().getName() +" "+ x.getP().getPosition()+ " points:  " + x.getP().getAvgpoints() + " Salary: " + x.getP().getSalary());
		System.out.println(x.getC().getName() +" "+ x.getC().getPosition()+ " points:  " + x.getC().getAvgpoints() + " Salary: " + x.getC().getSalary());
		System.out.println(x.getP2().getName() +" "+ x.getP2().getPosition()+ " points:  " + x.getP2().getAvgpoints() + " Salary: " + x.getP2().getSalary());
		System.out.println(x.getB1().getName() +" "+ x.getB1().getPosition()+ " points:  " + x.getB1().getAvgpoints() + " Salary: " + x.getB1().getSalary());
		System.out.println(x.getB2().getName() + " "+x.getB2().getPosition()+ " points:  " + x.getB2().getAvgpoints() + " Salary: " + x.getB2().getSalary());
		System.out.println(x.getB3().getName() +" "+ x.getB3().getPosition()+ " points:  " + x.getB3().getAvgpoints() + " Salary: " + x.getB3().getSalary());
		System.out.println(x.getSS().getName() +" "+ x.getSS().getPosition()+ " points:  " + x.getSS().getAvgpoints() + " Salary: " + x.getSS().getSalary());
		System.out.println(x.getOF1().getName() +" "+ x.getOF1().getPosition()+ " points:  " + x.getOF1().getAvgpoints() + " Salary: " + x.getOF1().getSalary());
		System.out.println(x.getOF2().getName() +" "+ x.getOF2().getPosition()+ " points:  " + x.getOF2().getAvgpoints() + " Salary: " + x.getOF2().getSalary());
		System.out.println(x.getOF3().getName() +" "+ x.getOF3().getPosition()+ " points:  " + x.getOF3().getAvgpoints() + " Salary: " + x.getOF3().getSalary());


		
}
	
    public static void putintoPositionList(){
    	for(Player player: listofplayers){
    	if(player.getPosition().contains("P")){
    		listofpitchers.add(player);
    		
    	}
    	if (player.getPosition().contains("C")){
    		listofcatchers.add(player);
    	}
    	if (player.getPosition().contains("1B")){
    		listof1B.add(player);
    	}
    	if (player.getPosition().contains("2B")){
    		listof2B.add(player);
    	}
    	if (player.getPosition().contains("3B")){
    		listof3B.add(player);
    	}
    	if (player.getPosition().contains("SS")){
    		listofSS.add(player);
    	}
    	if (player.getPosition().contains("OF")){
    		listofOF.add(player);
    	}

    	}
    }
    public static BaseballTeam GetRandomTeam(){
		int Pnumber = ThreadLocalRandom.current().nextInt(1, listofpitchers.size() );
		Player P = listofpitchers.get(Pnumber);
		int P2number = ThreadLocalRandom.current().nextInt(1, listofpitchers.size() );
		Player P2 = listofpitchers.get(P2number);
		int Cnumber = ThreadLocalRandom.current().nextInt(1, listofcatchers.size() );
		Player C = listofcatchers.get(Cnumber);
		int B1number = ThreadLocalRandom.current().nextInt(1, listof1B.size() );
		Player B1 = listof1B.get(B1number);
		int B2number = ThreadLocalRandom.current().nextInt(1, listof2B.size() );
		Player B2 = listof2B.get(B2number);
		int B3number = ThreadLocalRandom.current().nextInt(1, listof3B.size() );
		Player B3 = listof3B.get(B3number);
		int SSnumber = ThreadLocalRandom.current().nextInt(1, listofSS.size() );
		Player SS = listofSS.get(SSnumber);
		int OF1number = ThreadLocalRandom.current().nextInt(1, listofOF.size() );
		Player OF1 = listofOF.get(OF1number);
		int OF2number = ThreadLocalRandom.current().nextInt(1, listofOF.size() );
		Player OF2 = listofOF.get(OF2number);
		int OF3number = ThreadLocalRandom.current().nextInt(1, listofOF.size() );
		Player OF3 = listofOF.get(OF3number);
		BaseballTeam x = new BaseballTeam(P, P2, C, B1, B2, B3, SS, OF1, OF2, OF3);
		return x;
    }
	static private ArrayList<Player> getListofPlayers(BaseballTeam indexlist){
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(indexlist.getP());
		list.add(indexlist.getP2());
		list.add(indexlist.getC());
		list.add(indexlist.getSS());
		list.add(indexlist.getB1());
		list.add(indexlist.getB2());
		list.add(indexlist.getB3());
		list.add(indexlist.getOF1());
		list.add(indexlist.getOF2());
		list.add(indexlist.getOF3());

		return list;
		
	}

	public Player getP() {
		return P;
	}

	public Player getP2() {
		return P2;
	}

	public Player getC() {
		return C;
	}

	public Player getB1() {
		return B1;
	}

	public Player getB2() {
		return B2;
	}

	public Player getB3() {
		return B3;
	}

	public Player getSS() {
		return SS;
	}

	public Player getOF1() {
		return OF1;
	}

	public Player getOF2() {
		return OF2;
	}

	public Player getOF3() {
		return OF3;
	}

	static public boolean isDuplicate(BaseballTeam list){
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
	public double GetTeamSalary(){
		return P.getSalary() + P2.getSalary() + C.getSalary() + B1.getSalary() + B2.getSalary()+ B3.getSalary()+SS.getSalary() + OF1.getSalary() + OF2.getSalary() + OF3.getSalary();
	}
	public double GetTeamScore(){
		return P.getAvgpoints() + P2.getAvgpoints() + C.getAvgpoints() + B1.getAvgpoints() + B2.getAvgpoints()+ B3.getAvgpoints()+SS.getAvgpoints() + OF1.getAvgpoints() + OF2.getAvgpoints() + OF3.getAvgpoints();
	}
	
}
