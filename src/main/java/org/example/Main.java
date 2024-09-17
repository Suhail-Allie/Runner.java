package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   //Runner
    public interface Runner {
        void run();
    }

    //Machine
    public class Machine implements org.example.Runner {
        @Override
        public void run() {
            System.out.println("The machine is running to perform its tasks.");
        }
    }

    //Athlete
    public class Athlete implements org.example.Runner {
        @Override
        public void run() {
            System.out.println("The athlete is running in a marathon.");
        }
    }

    //PoliticalCandidate
    public class PoliticalCandidate implements org.example.Runner {
        @Override
        public void run() {
            System.out.println("The political candidate is running for office.");
        }
    }

    //DemoRunners
    public class DemoRunners {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            org.example.Runner runner = null;

            System.out.println("Enter the type of runner (Machine, Athlete, PoliticalCandidate): ");
            String runnerType = scanner.nextLine().trim().toLowerCase();

            switch (runnerType) {
                case "machine":
                    runner = new org.example.Machine();
                    break;
                case "athlete":
                    runner = new org.example.Athlete();
                    break;
                case "politicalcandidate":
                    runner = new org.example.PoliticalCandidate();
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



}