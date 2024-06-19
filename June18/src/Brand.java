public class Brand {
    String name;
    String engine;
    String colour;

    public Brand(String name, String engine, String colour) {
        this.name = name;
        this.engine = engine;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }


}
