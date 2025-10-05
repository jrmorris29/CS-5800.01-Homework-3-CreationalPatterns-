package Q2MacronutrientMeals;

public enum CarbOption {
    CHEESE("Cheese"),
    BREAD("Bread"),
    LENTILS("Lentils"),
    PISTACHIO("Pistachio");

    private final String label;
    CarbOption(String label){ this.label = label; }
    @Override public String toString(){ return label; }

    public boolean allowedFor(DietPlan plan){
        switch (plan){
            case PALEO:        
                return this == PISTACHIO;
            case VEGAN:        
                return this != CHEESE;
            case NUT_ALLERGY:  
                return this != PISTACHIO;
            default:           
                return true;
        }
    }
}