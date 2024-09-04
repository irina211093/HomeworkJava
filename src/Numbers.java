import java.util.Scanner;

public class Numbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a first number: ");
            double m = scanner.nextDouble();
            System.out.print("Enter a second number: ");
            double n = scanner.nextDouble();

            double reference = 10.0;

            double diffM = Math.abs(reference - m);
            double diffN = Math.abs(reference - n);
            
            if (diffM < diffN) {
                System.out.println("Число " + m + " ближе к 10.");
            } else if (diffN < diffM) {
                System.out.println("Число " + n + " ближе к 10.");
            } else {
                System.out.println("Числа " + m + " и " + n + " находятся на одинаковом расстоянии от 10.");
            }
        }
}
