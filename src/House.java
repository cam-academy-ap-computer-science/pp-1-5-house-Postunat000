
public class House {

	public static void main(String[] args) {
		Open();
		System.out.println("This is the rat,");
		MaltJack();
		System.out.println("");
		System.out.println("This is the cat,");
		RatThree();
		System.out.println("");
		System.out.println("This is the dog,");
		CatFour();
		System.out.println("");
		System.out.println("This is the cow with the crumpled horn,");
		DogFive();
		System.out.println("");
		System.out.println("This is the maiden all forlorn");
		CowSix();
	}
	
	public static void Open() {
		System.out.println("This is the house that Jack built.");
		System.out.println("");
		System.out.println("This is the malt");
		System.out.println("That lay in the house that Jack built.");
		System.out.println("");
	}
		
	public static void RatThree() {
		System.out.println("That killed the rat,");
		MaltJack();
	}
	
	public static void CatFour() {
		System.out.println("That worried cat,");
		System.out.println("That killed the rat,");
        MaltJack();
	}
	
	public static void DogFive() {
		TossedDog();
	}
	
	public static void CowSix() {
		System.out.println("That milked the cow with the crumpled horn,");
		TossedDog();
	}
	
	public static void TossedDog() {
		System.out.println("That tossed the dog,");
		System.out.println("That worried the cat,");
		System.out.println("That killed the rat,");
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}
	
	public static void MaltJack() {
		System.out.println("That ate the malt");
		System.out.println("That lay in the house that Jack built.");
	}
}
