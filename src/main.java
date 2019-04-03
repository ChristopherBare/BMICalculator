import java.util.Scanner;

public class main {

    private static Scanner scanner = new Scanner(System.in);
    private static BMI calculate = new BMI();

    public static void main(String[] args) {
        BMI chris = new BMI("Christopher", "Bare", 72.0, 213);
        System.out.println(chris.getFirstName() + " " + chris.getLastName() + "'s BMI is; " + chris.getBMI());
        try {
            calculateBMI();
            runProgram();
        } catch (Exception e) {
            System.out.println("Please enter a valid answer.");
            runProgram();
        }
    }

    public static void calculateBMI() {
        System.out.println("Would you like to calculate another BMI?");
        System.out.println("Please enter your first name:");
        calculate.setFirstName(scanner.next());
        System.out.println("Please enter your last name:");
        calculate.setLastName(scanner.next());
        System.out.println("Please enter your height in inches:");
        calculate.setHeight(scanner.nextDouble());
        System.out.println("Please enter your weight in pounds: ");
        calculate.setWeight(scanner.nextDouble());

        System.out.println(calculate.getFirstName() + " " + calculate.getLastName() + "'s BMI is; " + calculate.getBMI());
    }

    public static void runProgram() {
        boolean run = true;
        while (run) {
            System.out.println("Enter 1 to calculate another BMI.");
            System.out.println("Or if you would like to exit the program enter 0.");
            long r = scanner.nextInt();
            if (r == 0) {
                end();
            } else if (r >= 0) {
                calculateBMI();
            }
        }
    }

    public static void end() {
        System.exit(0);
    }
}
