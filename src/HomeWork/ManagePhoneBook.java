//package HomeWork;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ManagePhoneBook {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        PhoneBook phoneBook = new PhoneBook();
//        int choice;
//        while (true) {
//            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
//            System.out.println("1.Insert Phone");
//            System.out.println("2. Remove Phone");
//            System.out.println("3. Update Phone");
//            System.out.println("4. Search Phone");
//            System.out.println("5. Sort");
//            System.out.println("6. Exit");
//            choice = Integer.parseInt(input.nextLine());
//            switch (choice) {
//                case 1 :
//                    System.out.println("Input name");
//                    String name = input.nextLine();
//                    System.out.println("Input phone");
//                    String phone = input.nextLine();
//                    phoneBook.insertPhone(name, phone);
//                    System.out.println("PHONE ADDED" + "\n" + "NAME : " + name + "\n" + " PHONE : " + phone );
//
//
//                case 2 -> {
//                    System.out.println("Input name");
//                    String name = input.nextLine();
//                    phoneBook.removePhone(name);
//                    System.out.println("PHONE " + name + " DELETE FROM SYSTEM");
//
//                }
//                case 3 -> {
//                    System.out.println("Input name");
//                    String name = input.nextLine();
//                    System.out.println("Input phone");
//                    String phone = input.nextLine();
//                    phoneBook.updatePhone(name, phone);
//                    System.out.println("SYTEM UPDATE " + "\n" + "NAME : " + name + "\n" + "PHONE : " + phone);
//
//                }
//                case 4 -> {
//                    System.out.println("Input name");
//                    String name = input.nextLine();
//                    phoneBook.searchPhone(name);
//                    System.out.println("Searching.....");
//
//                }
//                case 5 -> {
//                    System.out.println("Arranging.......");
//                    phoneBook.sort();
//
//                }
//                case 6 ->
//                    System.exit(0);
//            }
//        }
//    }
//}
