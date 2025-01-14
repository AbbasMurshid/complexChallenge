//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        animal a = new animal("floffy" , 50 );
        dog d = new dog(a);
        System.out.println(d);
        String pretty = d.oString();
        System.out.println(pretty);
    }
    }
