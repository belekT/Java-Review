package FarmerExampleBehaviorParamtrization;

public class ApplePredicateHeavy implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        if(apple.getWeight()>200){
            return true;
        }else {
            return false;
        }
    }
}
