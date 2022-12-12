package FarmerExampleBehaviorParamtrization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingApple {
    public static void main(String[] args) {

        Apple a1 = new Apple("green",230);
        Apple a2 = new Apple("red",300);
        Apple a3 = new Apple("purple",53);
        Apple a4 = new Apple("white",35);
        Apple a5 = new Apple("green",90);
        List<Apple> inventoryOfApples = new ArrayList<>();
        inventoryOfApples.addAll(Arrays.asList(a1,a2,a3,a4,a5));
        ApplePredicate greenApple = new ApplePredicateGreenApple();
        ApplePredicate heavyApple200 = new ApplePredicateHeavy();

        // Print out green apples
        System.out.println( findApple(greenApple, inventoryOfApples));
        System.out.println("==========================================");
        // Print out apples heavier than 200
        System.out.println(findApple(heavyApple200,inventoryOfApples));
    }


    public static List<Apple> findApple(ApplePredicate applePredicate, List<Apple> inventoryOfApples){
        List<Apple> result = new ArrayList<>();
        for(Apple each : inventoryOfApples){
            if(applePredicate.test(each)){
                result.add(each);
            }
        }
        return result;
    }
}
