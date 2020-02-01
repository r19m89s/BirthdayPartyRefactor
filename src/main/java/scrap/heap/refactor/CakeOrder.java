package scrap.heap.refactor;

import lombok.Getter;
import scrap.heap.refactor.enums.Flavor;
import scrap.heap.refactor.enums.Shape;
import scrap.heap.refactor.enums.Size;

import java.util.Arrays;

@Getter
class CakeOrder extends  OrderType{
    private Flavor flavor;
    private Flavor frostingFlavor;
    private Shape shape;
    private Size size;

    CakeOrder(String[] cakeParams){
        super(Arrays.copyOfRange(cakeParams,4,5));
        this.flavor = Flavor.fromString(cakeParams[0]);
        this.frostingFlavor = Flavor.fromString(cakeParams[1]);
        this.shape = Shape.fromString(cakeParams[2]);
        this.size = Size.fromString(cakeParams[3]);
    }
}
