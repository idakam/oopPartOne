
public class Pet {
	
	//Instance variables
	private String name;
	private Integer age;
	private String location;
	private String type;
	
	//Empty constructor
	public Pet() {
		name = "no name";
		age = 0;
		location = "no location";
		type = "nothing";
	}
	
	//Constructor with all attributes
	public Pet(String name, Integer age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getType() {
		return type;
	}

	//Setters
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(Integer newAge) {
		this.age = newAge;
	}
	
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
	
}
