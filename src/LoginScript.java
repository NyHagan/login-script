import java.util.Scanner;

public class LoginScript {
    public static final User[] users = {
            new User("Trev", "Balatro123"),
            new User("phantom", "tomtom15"),
            new User("Supersky", "Iluvbeanz224"),
            new User("Mufasa", "LionKing1994")
    };

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = scanner.nextLine().toLowerCase();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    boolean isLoggedIn = false;
    for (User user : users) {
        if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
            isLoggedIn = true;
            break;
        }
    }

        if (isLoggedIn) {
            System.out.println("You have logged in successfully!");
        } else {
            System.out.println("Invalid login details!");
        }

        scanner.close();
    }
}
