import java.util.Scanner;

public class UserDialogs {
//    public static String getUsername() {
//        Scanner scaner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter your name:");
//            String name = scaner.nextLine().trim();
//            if (name.length() >= 2) {
//                return name;
//            }
//            System.out.println("Name is too short. Try again");
//        }
//    }
//
//    public static String getUserSelection() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
//            String calc = scanner.nextLine().trim().toUpperCase();
//            switch (calc) {
//                case "A":
//                    return "ADD";
//                case "S":
//                    return "SUB";
//                case "D":
//                    return "DIV";
//                case "M":
//                    return "MUL";
//                default:
//                    System.out.println("Wrong calculation.Try again.");
//
//            }
//        }
//    }
//
//    public static int getValue() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Number:");
//        int val = scanner.nextInt();
//        return val;
//    }


    public static String chooseColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select Color (B-Blue, G-Green, O-Orange, P-Purple).Enter First Word of Color: ");
            String chooser = scanner.nextLine().trim().toUpperCase();

            switch (chooser) {
                case "B":
                    return  "Blue";
                case "G":
                    return "Green";
                case "O":
                    return "Orange";
                case "P":
                    return "Purple";
                default:
                    System.out.println("Wrong Word.Try again");
            }

        }
    }
}




