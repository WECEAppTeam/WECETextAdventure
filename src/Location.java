
public class Location {
	
	String[] exits;
	String description;
	
	public Location(String[] exits, String description) {
		this.exits = exits;
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
		String s = "";
		//for each exit
		for (int i=0; i<exits.length; i++){
			//append each exit
			s += exits[i];
			if (i != exits.length - 1){
				s += ", ";
			}
		}
		return s;
	}
}
