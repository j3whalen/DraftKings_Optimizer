
public class Player {
	private String position;
	private String name;
	private double Salary;
	public double avgpoints;
	private String team;
	
	public Player(String position, String name, double Salary, double avgpoints, String team){
		this.position = position;
		this.name = name;
		this.Salary = Salary;
		this.avgpoints = avgpoints;
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public double getAvgpoints() {
		return avgpoints;
	}

	public void setAvgpoints(double avgpoints) {
		this.avgpoints = avgpoints;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
