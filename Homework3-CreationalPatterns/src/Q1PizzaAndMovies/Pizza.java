package Q1PizzaAndMovies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Pizza {
    private final String chain;          
    private final Size size;             
    private final List<Toppings> toppings; 

    private Pizza(String chain, Size size, List<Toppings> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public void eat() {
        System.out.println("---- Pizza ----");
        System.out.println("Chain: " + chain);
        System.out.println("Size : " + size);
        if (toppings.isEmpty()) {
            System.out.println("Toppings: (none)");
        } else {
            System.out.println("Toppings: " + toppings);
        }
        System.out.println();
    }

    public static class Builder {
        private final String chain;
        private Size size; 
        private final List<Toppings> toppings = new ArrayList<>();

        public Builder(String chain) {
            this.chain = Objects.requireNonNull(chain, "chain must not be null");
        }

        public Builder size(Size size) {
            this.size = Objects.requireNonNull(size, "size must not be null");
            return this;
        }

        public Builder pepperoni() { return add(Toppings.PEPPERONI); }
        public Builder sausage() { return add(Toppings.SAUSAGE); }
        public Builder mushrooms() { return add(Toppings.MUSHROOMS); }
        public Builder bacon() { return add(Toppings.BACON); }
        public Builder onions() { return add(Toppings.ONIONS); }
        public Builder extraCheese() { return add(Toppings.EXTRA_CHEESE); }
        public Builder peppers() { return add(Toppings.PEPPERS); }
        public Builder chicken() { return add(Toppings.CHICKEN); }
        public Builder olives() { return add(Toppings.OLIVES); }
        public Builder spinach() { return add(Toppings.SPINACH); }
        public Builder tomatoAndBasil() { return add(Toppings.TOMATO_AND_BASIL); }
        public Builder beef() { return add(Toppings.BEEF); }
        public Builder ham() { return add(Toppings.HAM); }
        public Builder pesto() { return add(Toppings.PESTO); }
        public Builder spicyPork() { return add(Toppings.SPICY_PORK); }
        public Builder hamAndPineapple() { return add(Toppings.HAM_AND_PINEAPPLE); }

        private Builder add(Toppings t) {
            if (!toppings.contains(t)) toppings.add(t);
            return this;
        }

        public Pizza build() {
            if (size == null)
                throw new IllegalStateException("Size is required and must be set before build().");
            return new Pizza(chain, size, toppings);
        }
    }
}