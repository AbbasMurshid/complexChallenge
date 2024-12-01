public class boredomeChlg {
    public static void main(String[] args) {
        int mathmarks = 80;
        int scienceMarks = 39;
        int englishmarks = 80;
        boolean ispass = (mathmarks >= 40 && scienceMarks >= 40 && englishmarks >= 40);
        double Average =  (mathmarks + scienceMarks + englishmarks) / 3.0;

        if (ispass) {
            System.out.println("Average Mark = " + Average);

            if (Average >= 90) {

                System.out.println("Grade : A");
            } else if (Average >= 80) {
                System.out.println("Grade : B");
            } else if (Average >= 70) {
                System.out.println("Grade : C");
            } else if (Average >= 60) {
                System.out.println("Grade : D");
            }

            System.out.println("Status : passed");
        } else {
            System.out.println("Average Mark = " + Average);
            System.out.println("Status : failed");
        }
    }
}
