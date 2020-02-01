package scrap.heap.refactor;
import lombok.Getter;

import java.util.List;

@Getter
public class App {
    private static Order order = new Order();

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
        for (int i = 0; i < balloonParameters.length; i++) {
            order.getOrderItems().add(new BalloonsOrder(balloonParameters[0]));
        }
        for (int j = 0; j < cakeParameters.length; j++) {
            order.getOrderItems().add(new CakeOrder(cakeParameters[j]));
        }
    }
    public static Order order(List<OrderType> orderTypes){
        return new Order(orderTypes);
    }
    public static BalloonsOrder orderBalloons(String[] balloonParams){
        return new BalloonsOrder(balloonParams);
    }
    public static CakeOrder orderCake(String[] cakeParams){
        return new CakeOrder(cakeParams);
    }
}
