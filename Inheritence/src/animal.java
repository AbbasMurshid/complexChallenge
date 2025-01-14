public class animal {

    private String name;
    private int weight;

    public animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name=" + name +
                ", weight=" + weight +
                '}';
    }
}
