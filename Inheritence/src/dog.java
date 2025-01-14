public class dog extends animal{


    private int height = 15;
    public dog(animal l) {
        super()

    }


    public String oString() {
        return "dog{" +
                "height=" + height +
                "} " + super.toString();
    }
}
