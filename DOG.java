interface DOG_essentials{
	default void barking() {		
	}
}



class DOGGY implements DOG_essentials {
	private String name;
	private String colour;
	private String breed;
	private boolean hungry;
	

	
	DOGGY(String name, String colour, String breed, boolean hungry){
		this.name = name;
		this.colour = colour;
		this.breed = breed;
		this.hungry = hungry;
				
	}
	
	public void fetching () {
		System.out.println("Hi i am fetching");
	}
	public void waggingTail() {
		System.out.println("Wagging Tail");
	}
	
	public void barking() {
		System.out.print("Bow!!");
	}
	
	public void details() {
		System.out.print("NAME : " + this.name);
		System.out.print("colour : " + this.colour);
		System.out.print("breed : " + this.breed);
		System.out.print("hungey : " + this.hungry);
	}

}

public class DOG{
	public static void main(String args[]) {
		DOGGY dog1 = new DOGGY("TOmmy","Brown","Lab",true);
		dog1.fetching();
		dog1.details();
		dog1.waggingTail();
	}
}
