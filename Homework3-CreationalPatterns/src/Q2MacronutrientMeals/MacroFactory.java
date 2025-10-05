package Q2MacronutrientMeals;

public class MacroFactory implements MacroAbstractFactory {
    private static MacroFactory INSTANCE = new MacroFactory();
    private MacroFactory(){}

    public static MacroFactory getInstance(){ return INSTANCE; }

    @Override public CarbsFactory carbsFactory()     { return CarbsFactory.getInstance(); }
    @Override public ProteinsFactory proteinsFactory(){ return ProteinsFactory.getInstance(); }
    @Override public FatsFactory fatsFactory()       { return FatsFactory.getInstance(); }
}

