package service;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AppLogic {


    public int retrieveUserChoice() {
        boolean inputEmpty = true;
        while (inputEmpty) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int userInput = Integer.parseInt(scanner.nextLine());
                if (userInput == 1) {
                    inputEmpty = false;
                    return 1;
                } else if (userInput == 2) {
                    inputEmpty = false;
                    return 2;
                } else if (userInput == 3) {
                    inputEmpty = false;
                    return 3;
                } else if (userInput == 4) {
                    inputEmpty = false;
                    return 4;
                } else if (userInput == 5) {
                    inputEmpty = false;
                    return 5;
                } else {
                    System.out.println("Please enter the correct number!");
                }
            } else {
                System.out.println("Please enter a number");
            }
        }
        return 0;
    }


    public void useUserChoice(int i) {
        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.print("Exiting..");
                System.exit(0);
        }
    }


}
