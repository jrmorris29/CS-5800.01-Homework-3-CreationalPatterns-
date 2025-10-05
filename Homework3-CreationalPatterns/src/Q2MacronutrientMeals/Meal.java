package Q2MacronutrientMeals;

public class Meal {
    private CarbOption carb;
    private ProteinOption protein;
    private FatOption fat;

    public Meal(CarbOption carb, ProteinOption protein, FatOption fat){
        this.carb = carb; this.protein = protein; this.fat = fat;
    }

    @Override
    public String toString(){
        return "Meal{Carb=" + carb + ", Protein=" + protein + ", Fat=" + fat + "}";
    }
}