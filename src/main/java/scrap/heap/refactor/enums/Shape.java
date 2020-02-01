package scrap.heap.refactor.enums;

public enum Shape {
    CIRCLE("circle"),
    SQUARE("square");

    private String name;

    Shape(String name){
        this.name = name;
    }

    public static Shape fromString(String text) {
        for (Shape b : Shape.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}