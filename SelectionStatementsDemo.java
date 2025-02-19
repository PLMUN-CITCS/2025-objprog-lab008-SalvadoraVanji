public class SelectionStatementsDemo {
    public static void main(String[] args) {
        int studentScore = 82;

        // Checking if the student passed
        if (studentScore >= 60) {
            System.out.println("You passed the exam!");
        }

        // Check if the student has excellent performance
        if (studentScore >= 90) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving!");
        }

        // Grade determination using nested if-else
        if (studentScore >= 90) {
            System.out.println("Grade: A");
        } else if (studentScore >= 75) {
           
