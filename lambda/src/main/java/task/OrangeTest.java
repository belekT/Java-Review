package task;

import com.thoughtworks.qdox.model.expression.Or;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory =new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(600).color(Color.RED).build());

///////////////////////////////// SIMPLE  FORMATTER ////////////////////////
        /*
               -- We need one interface inorder to use the lambda expression . Here we created OrangeFormatter interface and pass it to method as input.
                This is Behavior Parametrization with Lambda expressions.
               -- (Orange orange ) we can shorten as "orange" since here only one input , if more than one parametres we will use paratesis like Example:  "(Orange orane,Apple apple) "

        * */

         OrangeFormatter simpleFormatter = (Orange orange) -> "An orange of "+orange.getWeight() + "g";
            prettyPrintApple(inventory,simpleFormatter);

            /*
            *  -- Also we can pass the lambda expression directly to the method parameter
           */
         prettyPrintApple(inventory, orange -> "An orange of "+orange.getWeight() + "g");

///////////////////////////////// FANCY FORMATTER ////////////////////////
        /*
           --  We use "{}" in lambda expression when there are more than 1 line; Here is more than one line that is why it is in " { } "
           --  Also with multiple lines you need to use "return" keyword as well
           -- you can use if statement or loop in "{}"
     */
         OrangeFormatter fancyFormatter = orange -> {
             String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
             return "A" + characteristic + " "+ orange.getColor()+ " orange";
         };

         prettyPrintApple(inventory,fancyFormatter);
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange: inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
/*
*   -- If we have another Interface which takes one objec as input and returns String , question , Can we use that interface instead of OrangeFormatter interface.
               The answer , Yes , we can use. The signature of the method should be the same as lambda expression.
*
*
*
* */