public class day2 {
    public static void main(String[] args) {
        int age = 20;
        int gymFees = 1500;

        int actualGymFees =  (int) ((gymFees>=1000) ? (gymFees - gymFees*0.2) : (gymFees - gymFees*0.1)) ;

        if (age >=18){
            System.out.println("You are eligible for the gym. Your fee is ₹" + actualGymFees);
        }
        else {
        System.out.println("Your are Not eligible for A GYM I AM SORRY");
        }
    }
}
