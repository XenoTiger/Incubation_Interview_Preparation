public final class Immutable { // so that it cannot extend

    private final String name;  //its final so value cannot be changed

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() { // We will only have getter
        return name;
    }
}
