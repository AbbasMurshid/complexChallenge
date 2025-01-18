package myproject.LinkedList;



import java.util.Scanner;


public class TripApplication {


    public static <town> void main(String[] args) {

        TripOperation IV = new TripOperation("IV"  );

        runProgram(IV);

    }

    private static void runProgram(TripOperation application) {
        Scanner sc = new Scanner(System.in);
        int input;
        String Town;
        int distance;

        boolean flag = true;

        System.out.print("How many Town would you like to add? ");
        int TownNum = Integer.parseInt(sc.nextLine());
        Town[] list = new Town[TownNum];


        System.out.println("Enter starting town: ");
        String startTown = sc.nextLine();
        Town StartPlace = new Town(startTown);
        application = new TripOperation(StartPlace);

        System.out.println("""
                1--> Menu Options
                0-->Exit""");
        input = Integer.parseInt(sc.nextLine());
        if (input == 1) {
            while (flag) {
                System.out.println("""
                        Choose Menu Options (Number)
                        1-->Add Town
                        2-->Remove Town
                        3-->Display Town you Added
                        4-->Start Plan Trip
                        5-->Quit Program
                        Choose Menu Options (Number)""");
                input = Integer.parseInt(sc.nextLine());

                switch (input) {
                    case 1 -> {
                        for (int i = 0; i <= list.length; i++) {
                            System.out.println("Enter the name of the town: ");
                            String name = sc.nextLine();
                            System.out.println("Enter the distance of the town From Sydney: ");
                            distance = Integer.parseInt(sc.nextLine());
                            if (i == list.length) {
                                System.out.println("Entered Out of Bounds");

                                break;

                            }
                            list[i] = new Town(name, distance);
                            application.addTown(list[i]);

                        }
                        System.out.println("All Towns Added");
                        application.getTown();
                    }
                    case 2 -> {
                        System.out.println("Removing Town From Plan Trip");
                        String TownName = sc.nextLine();
                        application.removeTown(TownName);
                        application.getTown();


                    }
                    case 3 -> {
                        System.out.println("Displaying Town From Plan Trip");
                        application.getTown();
                    }
                    case 4 -> {
                        System.out.println("Start Plan Trip : " + application.tripName() + '\n');
                        application.getTown();
                        application.tripStart();
                        System.out.println("Enjoy the Town");
                    }
                    case 5 -> {
                        System.out.println("Quit Program");
                        flag = false;

                    }

                }
            }
        }
        else if (input == 0) {
            System.out.println("THANK YOU!");

        }
        else {
            System.out.println("Sorry, that is not a valid option");
        }



    }
}