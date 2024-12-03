public class GradeCaculation {
    public static void main(String[] args) {
        int mathMarks = 85;
        int scienceMarks = 92;
        int englishMarks = 78;


        if(mathMarks > 50 && scienceMarks > 50 && englishMarks > 50) {
            // Step 2: Calculate Total Marks
            int totalMarks = calculateTotal(mathMarks, scienceMarks, englishMarks);
            System.out.println("Total Marks: " + totalMarks);

            // Step 3: Calculate Average
            double average = calculateAverage(totalMarks, 3);
            System.out.println("Average Marks: " + average);

            // Step 4: Get and Print Grade
            String grade = getGrade(average);
            System.out.println("Grade: " + grade);
        }else {
            System.out.println("Student Failed");
        }
    }

    public static int calculateTotal(int a , int b , int c) {
        return a+b+c;
    }
    public static double calcuateTotal(double a, double b, double c) {
        return a+b+c;
    }
    public static int calculateAverage(int total ,int subjectCount ) {
        return total/subjectCount;
    }
    public static double calculateAverage(double total , int subjectCount ) {

         double v=       total/subjectCount;
        return v;
    }

    public static String getGrade(double average){
            if (average >= 90) {
                return "A";
            }
            else if (average >= 80) {
                return "B";

            }
            else if (average >= 70) {
                return "C";

            }
            else if (average >= 60) {
                return "D";}

            else {
                return "Fail";
            }
    }
}
