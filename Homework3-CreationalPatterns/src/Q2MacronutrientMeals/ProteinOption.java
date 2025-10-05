package Q2MacronutrientMeals;

public enum ProteinOption {
    FISH("Fish"),
    CHICKEN("Chicken"),
    BEEF("Beef"),
    TOFU("Tofu");

    private final String label;
    ProteinOption(String label){ this.label = label; }
    @Override public String toString(){ return label; }

    public boolean allowedFor(DietPlan plan){
        switch (plan){
            case PALEO:        
                return this != TOFU;
            case VEGAN:        
                return this == TOFU;
            default:           
                return true;
        }
    }
}