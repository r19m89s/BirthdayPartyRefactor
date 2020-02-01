package scrap.heap.refactor.enums;

public enum Size {
    LARGE("large"),
    MED("med"),
    SMALL("small");

    private String name;

    Size(String name){
        this.name = name;
    }
    public static Size fromString(String text) {
        for (Size b : Size.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
