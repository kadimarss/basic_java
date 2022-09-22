package Week9.library.ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(reader);

        userInterface.printTitle(); // it works!
    }
}
