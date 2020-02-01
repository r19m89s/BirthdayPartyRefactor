package scrap.heap.refactor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
class Order {
    List<OrderType> orderItems;

    Order(){
        orderItems = new ArrayList<>();
    }
}
