package scrap.heap.refactor;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class BalloonsOrder {
    private String balloonColor;
    private String material;
    private String number;

    BalloonsOrder(String[] balloonParams){
        this.balloonColor = balloonParams[0];
        this.material = balloonParams[1];
        this.number = balloonParams[2];
    }
}
