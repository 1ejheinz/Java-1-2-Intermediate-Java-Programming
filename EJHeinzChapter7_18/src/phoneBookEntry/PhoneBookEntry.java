package phoneBookEntry;
/*Write a class named PhoneBookEntry that has fields for a person’s name and phone number. 
The class should have a constructor and appropriate accessor and mutator methods. 
Then write a program that creates at least five PhoneBookEntry objects and stores them in an ArrayList. 
Use a loop to display the contents of each object in the ArrayList*/
import java.util.ArrayList;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;
    private String email;

    // Constructors
    public PhoneBookEntry(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter and Setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override 
    @Override
    public String toString() {
        return "PhoneBookEntry [Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email + "]";
    }

    // Main method Test
    public static void main(String[] args) {
        // Create an ArrayList to store PhoneBookEntry objects
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

        // Add five PhoneBookEntry objects to the ArrayList
        phoneBook.add(new PhoneBookEntry("EJ Heinz", "397-1234", "ejheinz@example.com"));
        phoneBook.add(new PhoneBookEntry("Jane Doe", "397-5678", "janedoe@example.com"));
        phoneBook.add(new PhoneBookEntry("Mike Johnson", "397-8765", "mikejohnson@example.com"));
        phoneBook.add(new PhoneBookEntry("Emily Davis", "397-4321", "emilydavis@example.com"));
        phoneBook.add(new PhoneBookEntry("Chris Rock", "397-3456", "chrisrock@example.com"));

        // Loop 
        for (PhoneBookEntry entry : phoneBook) {
            System.out.println(entry);
        }
    }
}
