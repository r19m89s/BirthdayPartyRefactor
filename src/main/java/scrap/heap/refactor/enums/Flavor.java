package scrap.heap.refactor.enums;

public enum Flavor {
    CHOCOLATE("chocolate"),
    VANILLA("vanilla");

    private String name;

    Flavor(String flavor){
        this.name = flavor;
    }
    public static Flavor fromString(String text) {
        for (Flavor b : Flavor.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
