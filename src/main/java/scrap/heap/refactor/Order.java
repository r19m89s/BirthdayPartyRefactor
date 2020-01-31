package scrap.heap.refactor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
class Order {
    private CakeOrder cakeOrder;
    private BalloonsOrder balloons;
}
