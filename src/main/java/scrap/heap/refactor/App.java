package scrap.heap.refactor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class App {
    private static List<Order> orders = new ArrayList<>();

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        String[][] balloonParameters = new String[][] {
                {"red", "mylar", "4"},
                {"blue", "latex", "7"},
                {"yellow", "mylar", "4"}
        };
        String[][] cakeParameters = new String[][] {
                {"chocolate", "chocolate", "circle", "large", "brown"},
                {"Vanilla", "chocelate", "square", "med", "brown"},
                {"vanilla", "vanilla", "square", "small", "yellow"}
        };
        for (int i = 0; i < balloonParameters.length; i++){
            orders.add(new Order(orderCake(cakeParameters[i]), orderBalloons(balloonParameters[i])));
        }
    }
    public static Order order(String[] cakeParams, String[] balloonParams){
        return new Order( orderCake(cakeParams), orderBalloons(balloonParams));
    }
    public static BalloonsOrder orderBalloons(String[] balloonParams){
        return new BalloonsOrder(balloonParams);
    }
    public static CakeOrder orderCake(String[] cakeParams){
        return new CakeOrder(cakeParams);
    }
}
