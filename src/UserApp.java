import java.util.Scanner;

public class UserApp {
    public static final int ADD = 0;
    public static final int FIND = 1;
    public static final int EXIT = 2;
    private static User2 usr = new User2();

    private static void addUser(Scanner scanner){
        User user = new User();
        System.out.println("Adding user.");
        System.out.println("Name: ");
        user.setName(scanner.nextLine());
        System.out.println("Surename: ");
        user.setSurename(scanner.nextLine());
        System.out.println("Age: ");
        user.getAge(scanner.nextInt());
        System.out.println("UserID: ");
        user.getUserID(scanner.nextLine());

        scanner.nextLine();

    }
    private static void findingUser(Scanner scanner) {
        System.out.println("Searching User.");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Surename: ");
        String surename = scanner.nextLine();

        User user = usr.get(name, surename);
        System.out.println(user);
    }
    private static void printOption(){
        System.out.println("0 - Add user");
        System.out.println("1 - Find user");
        System.out.println("2 - EXIT");

    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int userOption;
            do {
                printOption();
                userOption = scanner.nextInt();
                scanner.nextLine();

                switch (userOption) {
                    case UserApp.ADD:
                        addUser(scanner);
                        break;
                    case UserApp.FIND:
                        findingUser(scanner);
                        break;
                    case UserApp.EXIT:
                        break;

                }
            } while (userOption != UserApp.EXIT);


        }

    }

}
