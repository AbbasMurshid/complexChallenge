import java.util.Scanner;

public class Inputting {

    public static void main(String[] args) {


        int count = 5;
        int value1, value2, value3, value4, value5;
        
        int value = input(count);
        System.out.println("Value is "+value);

    }


    public static int input(int count) {
        Scanner scanner = new Scanner(System.in);
        try {

            int sum = 0;
            boolean check = true;

            {
                for (int i = 1; i <= count; i++) {

                    System.out.print("Enter the number #" + i + ":");
                    int value = Integer.parseInt(scanner.nextLine());
                    sum += value;
                }
                return sum;

            }
        }catch(NumberFormatException e){


            System.out.println("Please enter an integer");

        }
        return 0;


    }

}

