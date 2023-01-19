public abstract class PastaDish {
	public final void makeRecipe() {
		boilWater();
		Pastatype();
		addSauce();
		addProtein();
		cookPasta();
		garnishPlate();
		System.out.println("Dish is Prepared :))\t\t\t\t\t|");
	}
	
	private void boilWater() {
		System.out.println("Water is Boiled.\t\t\t\t\t|");
	}
	private void cookPasta() {
		System.out.println("Pasta is Cooked.\t\t\t\t\t|");
	}
	public abstract void Pastatype();
	public abstract void addSauce();
	public abstract void addProtein();
	public abstract void garnishPlate();
}
