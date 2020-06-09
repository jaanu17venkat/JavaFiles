package dynamicpolyDay10Work;

import java.util.Scanner;
public class Forest {

	Scanner scanner;
	Forest(){
		scanner=new Scanner(System.in);
	}
	void createAnimal() {
		Animal animal=null;
		System.out.println("enter the animal of your choice");
		String userInput=scanner.nextLine();
		System.out.println(userInput.toLowerCase());
		if(userInput.toLowerCase().equals("animal"))
			animal=new Animal();
		else if(userInput.toLowerCase().equals("snake"))
			animal=new snake();
		else if(userInput.toLowerCase().equals("monkey"))
			animal=new monkey();
		else
			animal=null;
		if(animal !=null)
			doAnimalActivities(animal);
		else
			System.out.println("you have animals in the forest yet....");
	}
	void doAnimalActivities(Animal anyAnimal) {
		anyAnimal.eat();
		anyAnimal.move();
		anyAnimal.sleep();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Forest forest=new Forest();
forest.createAnimal();
	}

}
