import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Matriculation marks: ");
        int matriculationMarks = scanner.nextInt();

        System.out.print("Enter your Intermediate marks: ");
        int intermediateMarks = scanner.nextInt();

        System.out.print("Enter your Test result: ");
        int testResult = scanner.nextInt();

        int totalMarks = matriculationMarks + intermediateMarks + testResult;
        int cpn = totalMarks / 3;

        System.out.println("Your CPN is: " + cpn);
    }
}