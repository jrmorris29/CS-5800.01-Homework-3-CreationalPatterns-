package Q2MacronutrientMeals;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class FatsFactory implements Factory<FatOption> {
    private static FatsFactory INSTANCE = new FatsFactory();
    private FatsFactory(){}

    public static FatsFactory getInstance(){ return INSTANCE; }

    @Override
    public FatOption pickRandomAllowed(DietPlan plan){
        List<FatOption> allowed = new ArrayList<>();
        for (FatOption f : FatOption.values()){
            if (f.allowedFor(plan)) allowed.add(f);
        }
        if (allowed.isEmpty())
            throw new IllegalStateException("No fat options allowed for " + plan);
        return allowed.get(ThreadLocalRandom.current().nextInt(allowed.size()));
    }
}

