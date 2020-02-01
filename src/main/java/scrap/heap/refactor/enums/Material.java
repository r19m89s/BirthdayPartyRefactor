package scrap.heap.refactor.enums;

public enum Material {
    MYLAR("mylar"),
    LATEX("latex");
    private String name;
    Material(String name){
        this.name = name;
    }
    public static Material fromString(String text) {
        for (Material b : Material.values()) {
            if (b.name.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}