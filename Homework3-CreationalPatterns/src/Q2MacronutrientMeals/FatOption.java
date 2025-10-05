package Q2MacronutrientMeals;

public enum FatOption {
    AVOCADO("Avocado"),
    SOUR_CREAM("Sour cream"),
    TUNA("Tuna"),
    PEANUTS("Peanuts");

    private final String label;
    FatOption(String label){ this.label = label; }
    @Override public String toString(){ return label; }

    public boolean allowedFor(DietPlan plan){
        switch (plan){
            case PALEO:        
                return this != SOUR_CREAM;
            case VEGAN:        
                return this != SOUR_CREAM && this != TUNA;
            case NUT_ALLERGY:  
                return this != PEANUTS;
            default:           
                return true;
        }
    }
}