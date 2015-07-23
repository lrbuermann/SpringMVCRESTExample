package lrbuermann.sample.SpringREST.beans;

public class Player {
	private String firstName;
	private String lastName;
	private String team;
	private String position;
	public Player(String firstName, String lastName, String team, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.position = position;
	}
	public Player(){
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
}
