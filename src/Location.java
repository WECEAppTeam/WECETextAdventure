
public class Location {
	
	String description;
	Location northLocation;
	Location southLocation;
	Location eastLocation;
	Location westLocation;
	
	public Location(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		String s = description;
		s += "\nObvious exits are ";
		s += getExits();
		s += ".";
		return s;
	}

	//builds a string to return what exits are available
	public String getExits() {
		String s = "NOT YET CODED";
		//for each exit
		
		//do stuff
		return s;
	}

	Location getNorthLocation(){
		return northLocation;
	}
	Location getSouthLocation(){
		return southLocation;
	}
	Location getEastLocation(){
		return eastLocation;
	}
	Location getWestLocation(){
		return westLocation;
	}
	void setNorthLocation(Location location){
		this.northLocation = location;
	}
	void setSouthLocation(Location location){
		this.southLocation = location;
	}
	void setEastvoid(Location location){
		this.eastLocation = location;
	}
	void setWestLocation(Location location){
		this.westLocation = location;
	}
	
}
