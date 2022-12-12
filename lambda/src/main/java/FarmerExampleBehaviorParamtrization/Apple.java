package FarmerExampleBehaviorParamtrization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Apple {
    String color;
    int weight;

    public Apple(String color, int weight){
        this.color =color;
        this.weight=weight;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }

    public String toString(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this,Apple.class);
    }
}
