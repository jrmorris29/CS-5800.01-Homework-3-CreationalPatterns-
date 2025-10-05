package Q2MacronutrientMeals;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProteinsFactory implements Factory<ProteinOption> {
    private static ProteinsFactory INSTANCE = new ProteinsFactory();
    private ProteinsFactory(){}

    public static ProteinsFactory getInstance(){ return INSTANCE; }

    @Override
    public ProteinOption pickRandomAllowed(DietPlan plan){
        List<ProteinOption> allowed = new ArrayList<>();
        for (ProteinOption p : ProteinOption.values()){
            if (p.allowedFor(plan)) allowed.add(p);
        }
        if (allowed.isEmpty())
            throw new IllegalStateException("No protein options allowed for " + plan);
        return allowed.get(ThreadLocalRandom.current().nextInt(allowed.size()));
    }
}