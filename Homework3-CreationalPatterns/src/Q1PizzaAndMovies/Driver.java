package Q1PizzaAndMovies;

public class Driver {
    public static void main(String[] args) {

        Pizza small3 = new Pizza.Builder("Pizza Hut")
                .size(Size.SMALL)
                .pepperoni().mushrooms().onions()
                .build();

        Pizza medium6 = new Pizza.Builder("Pizza Hut")
                .size(Size.MEDIUM)
                .pepperoni().sausage().bacon().olives().spinach().extraCheese()
                .build();

        Pizza large9 = new Pizza.Builder("Pizza Hut")
                .size(Size.LARGE)
                .pepperoni().sausage().mushrooms().bacon().onions()
                .peppers().olives().tomatoAndBasil().extraCheese()
                .build();

        small3.eat();
        medium6.eat();
        large9.eat();


        Pizza phLarge3 = new Pizza.Builder("Pizza Hut")
                .size(Size.LARGE)
                .pepperoni().bacon().extraCheese()
                .build();

        Pizza phSmall2 = new Pizza.Builder("Pizza Hut")
                .size(Size.SMALL)
                .ham().pesto()
                .build();


        Pizza lcMedium8 = new Pizza.Builder("Little Caesars")
                .size(Size.MEDIUM)
                .pepperoni().sausage().mushrooms().onions()
                .peppers().olives().spinach().extraCheese()
                .build();

        Pizza lcSmall6 = new Pizza.Builder("Little Caesars")
                .size(Size.SMALL)
                .pepperoni().chicken().bacon().tomatoAndBasil().beef().olives()
                .build();


        Pizza domSmall1 = new Pizza.Builder("Dominos")
                .size(Size.SMALL)
                .hamAndPineapple()
                .build();

        Pizza domLarge3 = new Pizza.Builder("Dominos")
                .size(Size.LARGE)
                .spicyPork().pepperoni().onions()
                .build();

        phLarge3.eat();
        phSmall2.eat();
        lcMedium8.eat();
        lcSmall6.eat();
        domSmall1.eat();
        domLarge3.eat();
    }
}