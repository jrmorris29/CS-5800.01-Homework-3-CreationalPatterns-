package Q2MacronutrientMeals;

public interface Factory<T> {
    T pickRandomAllowed(DietPlan plan);
}