package Q2MacronutrientMeals;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CarbsFactory implements Factory<CarbOption> {
    private static CarbsFactory INSTANCE = new CarbsFactory();
    private CarbsFactory(){}

    public static CarbsFactory getInstance(){ return INSTANCE; }

    @Override
    public CarbOption pickRandomAllowed(DietPlan plan){
        List<CarbOption> allowed = new ArrayList<>();
        for (CarbOption c : CarbOption.values()){
            if (c.allowedFor(plan)) allowed.add(c);
        }
        if (allowed.isEmpty())
            throw new IllegalStateException("No carb options allowed for " + plan);
        return allowed.get(ThreadLocalRandom.current().nextInt(allowed.size()));
    }
}