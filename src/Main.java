
public class Main {

	public static void main(String[] args) {
		//Testing Pet Program
		Pet dog = new Pet("Nico", 11, "Austin", "Poodle");
		System.out.println("Name: " + dog.getName() + "\nAge: " + dog.getAge() + "\nBreed: " + dog.getType());
		
		//Testing Book Program
		Book lotr = new Book("The Lord of the Rings ", "J. R. R. Tolkien ", 1178);
		System.out.println(lotr);
		System.out.println(lotr.isFullLengthNovel());	
	}

}
