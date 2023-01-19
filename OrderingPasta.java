public class OrderingPasta {
	public static void main(String[] args) {
		System.out.println("========================================================|");
		System.out.println("Preparing Spaghetti Meatballs:                          |");
		System.out.println("========================================================|");
		PastaDish ptype = new SpaghettiMeatballs();
		ptype.makeRecipe();
		System.out.println("========================================================|");
		
		System.out.println("========================================================|");
		System.out.println("Preparing Penne Alferado:                               |");
		System.out.println("========================================================|");
		ptype = new PenneAlferado();
		ptype.makeRecipe();
		System.out.println("========================================================|");
	}
}
