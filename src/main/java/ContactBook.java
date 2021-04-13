import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {

  private Map <String, String> contactBook = new HashMap<String,String>();
  private String name;
  private String email;

public String addName(String prompt){
  System.out.println(prompt);
  Scanner scanner = new Scanner(System.in);
  String newContact = scanner.nextLine();
  while(newContact.isBlank()){
    System.out.println("Invalid input. Please enter a valid contact.");
    newContact = scanner.nextLine();
  }
  return newContact;
}

public String addEmail(String prompt){
  System.out.println(prompt);
  Scanner scanner = new Scanner(System.in);
  String email = scanner.nextLine();
  while(email.isBlank() || !email.contains("@")){
    System.out.println("Invalid input. Please enter a valid email.");
    email = scanner.nextLine();
  }
  return email;
}
  public void addContact() {
    name = addName("Please add a contact");
    email = addEmail("Please enter a email");
    contactBook.put(name,email);
    System.out.println("Thank you, you have successfully added a new contact with the name: "+ name + " email: "+email);
  }

  public void lookUp(){
  name = addName("Please enter a contact name");
  if(contactBook.containsKey(name)){
    System.out.println("The email address of "+ name +" is: " +contactBook.get(name));
  }else{
    System.out.println("Sorry, the contact was not found");
  }
  }

  public void distribution(){
  for(String name:contactBook.keySet()){
    System.out.println(
        "\"" + name + "\" <"+contactBook.get(name)+">, ");
  }
  }
}
