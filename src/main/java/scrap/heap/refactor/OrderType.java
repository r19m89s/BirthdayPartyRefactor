package scrap.heap.refactor;

import lombok.Getter;
import lombok.Setter;
import scrap.heap.refactor.enums.Color;

@Getter
@Setter
public class OrderType{
    Color color;

    OrderType(String[] params){
        this.color = Color.fromString(params[0]);
    }
}
