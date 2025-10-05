package Q2MacronutrientMeals;

public class MacronutrientKitchen {
    private MacroAbstractFactory factory;

    public MacronutrientKitchen(MacroAbstractFactory factory){
        this.factory = factory;
    }

    public Meal prepareMeal(DietPlan plan){
        CarbOption c = factory.carbsFactory().pickRandomAllowed(plan);
        ProteinOption p = factory.proteinsFactory().pickRandomAllowed(plan);
        FatOption f = factory.fatsFactory().pickRandomAllowed(plan);
        return new Meal(c, p, f);
    }
}