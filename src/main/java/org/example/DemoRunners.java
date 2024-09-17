package org.example;
import java.util.Scanner;

    public class DemoRunners {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Runner runner = null;

            System.out.println("Enter the type of runner (Machine, Athlete, PoliticalCandidate): ");
            String runnerType = scanner.nextLine().trim().toLowerCase();

            switch (runnerType) {
                case "machine":
                    runner = new Machine();
                    break;
                case "athlete":
                    runner = new Athlete();
                    break;
                case "PoliticalCandidate":
                    runner = new PoliticalCandidate();
                    break;
                default:
                    System.out.println("Invalid input. Please enter either 'Machine', 'Athlete', or 'PoliticalCandidate'.");
                    break;
            }

            if (runner != null) {
                runner.run(); // Call the run method for the selected object
            }

            scanner.close();
        }
    }


