public class evenchlg {

    public static void main(String[] args) {

        int count = 0;

        while (count <=20) {

            if (isEvenNumber(count)) {
                System.out.println(count);
            }
            else {
                System.out.println(count + "Its Not A even Number");
            }
            count++;

        }

    }

    public static boolean isEvenNumber(int number){

        return number % 2 == 0;

    }

}
