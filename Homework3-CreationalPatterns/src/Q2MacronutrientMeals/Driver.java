package Q2MacronutrientMeals;

public class Driver {
    public static void main(String[] args) {
        MacroAbstractFactory abstractFactory = MacroFactory.getInstance(); 
        MacronutrientKitchen kitchen = new MacronutrientKitchen(abstractFactory);

        
        Customer[] customers = new Customer[] {
                new Customer("Alice", DietPlan.NO_RESTRICTION),
                new Customer("Bob",   DietPlan.PALEO),
                new Customer("Carol", DietPlan.VEGAN),
                new Customer("Dave",  DietPlan.NUT_ALLERGY),
                new Customer("Eve",   DietPlan.NO_RESTRICTION),
                new Customer("Frank", DietPlan.VEGAN)
        };

        for (Customer c : customers){
            Meal meal = kitchen.prepareMeal(c.plan());
            System.out.println("Customer: " + c.name()
                    + " | Plan: " + c.plan()
                    + " | " + meal);
        }
    }
}