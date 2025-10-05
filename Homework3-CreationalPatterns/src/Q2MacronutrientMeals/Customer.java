package Q2MacronutrientMeals;

public class Customer {
    private String name;
    private DietPlan plan;

    public Customer(String name, DietPlan plan){
        this.name = name;
        this.plan = plan;
    }

    public String name(){ return name; }
    public DietPlan plan(){ return plan; }
}