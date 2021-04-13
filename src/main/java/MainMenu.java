import java.util.Scanner;

public class MainMenu {

  public static void main(String[] args) {
    int choice = 0;
    ContactBook contact = new ContactBook();
    do {
      System.out.println("Please select from below options by the index\n"
          + "1. Add a contact\n"
          + "2. Look up a contact\n"
          + "3. Distribution List\n"
          + "4. Exit\n"
          + ">>");
      Scanner option = new Scanner(System.in);
      try {
        choice = Integer.parseInt(option.nextLine());
      } catch (NumberFormatException error) {
        System.out.println("Please enter a number");
      }
      if (choice == 1) {
        System.out.println("Add a contact");
        contact.addContact();
      } else if (choice == 2) {
        System.out.println("Look up a contact");
        contact.lookUp();
      } else if (choice == 3) {
        System.out.println("Below is the distribution list:");
        contact.distribution();
      } else if (choice != 4) {
        System.out.println("Invalid index, please enter again\n");
      }
    } while (choice != 4);
    System.out.println("Thank you, bye.");
  }
}
