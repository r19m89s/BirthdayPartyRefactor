package scrap.heap.refactor.enums;

public enum Color {
    RED("red"),
    BLUE("blue"),
    BROWN("brown"),
    YELLOW("yellow");

    private String name;

    Color(String color){
        this.name = color;
    }
    public static Color fromString(String text) {
        for (Color b : Color.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
