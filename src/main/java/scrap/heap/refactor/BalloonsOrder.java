package scrap.heap.refactor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;

import java.util.Arrays;

@Getter
class BalloonsOrder extends OrderType {
    private Material material;
    private Integer number;

    BalloonsOrder(String[] balloonParams){
        super(Arrays.copyOfRange(balloonParams, 0, 1));
        this.material = Material.fromString(balloonParams[1]);
        this.number = Integer.parseInt(balloonParams[2]);
    }
}
