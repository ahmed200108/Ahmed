public abstract class PastaDishTemplate {
    
    public final void make_recipe(){
    boil();
    addsauce();
    addproteins();
    addgarnish();
    System.out.println("Dish Is Readyy :))))))))");
    }
    private void boil(){
         System.out.println("Boiling the pasta");
    }
    
    public abstract void addsauce(); 
    public abstract void addproteins();
    public abstract void addgarnish(); 
    
}