package Q2MacronutrientMeals;

public interface MacroAbstractFactory {
    CarbsFactory carbsFactory();
    ProteinsFactory proteinsFactory();
    FatsFactory fatsFactory();
}

