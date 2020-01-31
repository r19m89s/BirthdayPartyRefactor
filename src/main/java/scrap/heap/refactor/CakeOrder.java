package scrap.heap.refactor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class CakeOrder {
    private String flavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    private String cakeColor;

    CakeOrder(String[] cakeParams){
        this.flavor = cakeParams[0];
        this.frostingFlavor = cakeParams[1];
        this.shape = cakeParams[2];
        this.size = cakeParams[3];
        this.cakeColor = cakeParams[4];
    }
}
