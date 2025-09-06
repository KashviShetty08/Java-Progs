package stackperson;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack ticketStack = null;

        System.out.println("Choose Initialization:");
        System.out.println("1. Empty stack with size");
        System.out.println("2. Stack initialized with array of people");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (choice == 1) {
            System.out.print("Enter Size: ");
            int capacity = sc.nextInt();
            ticketStack = new Stack(capacity);
        } 
        else if (choice == 2) {
            System.out.print("Enter the number of persons: ");
            int n = sc.nextInt();
            sc.nextLine(); // clear buffer
            Person[] people = new Person[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for person " + (i+1));
                people[i] = readPerson(sc);
            }
            ticketStack = new Stack(people);
        }

        int option;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push one");
            System.out.println("2. Push two");
            System.out.println("3. Pop one");
            System.out.println("4. Pop many");
            System.out.println("5. Show all (top → bottom)");
            System.out.println("6. Show top n");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) 
            {
                case 1: 
                {
                    Person p = readPerson(sc);
                    ticketStack.push(p);
                    break;
                }
                case 2:
                
                {
                    System.out.println("Enter first person details:");
                    Person p1 = readPerson(sc);
                    System.out.println("Enter second person details:");
                    Person p2 = readPerson(sc);
                    ticketStack.push(p1, p2);
                    break;
                }
                case 3:
                {
                    Person popped = ticketStack.pop();
                    if (popped != null) {
                        System.out.print("Popped -> ");
                        popped.displayPerson();
                    }
                    break;
                }
                case 4: 
                {
                    System.out.print("How many to be popped: ");
                    int n = sc.nextInt();
                    ticketStack.pop(n);
                    break;
                }
                case 5:
                {
                    ticketStack.display();
                    break;
                }
                case 6: 
                {
                    System.out.print("Enter number of top persons: ");
                    int topN = sc.nextInt();
                    ticketStack.displayTopN(topN); // use the renamed method
                    break;
                }
                case 7:
                    System.out.println("EXITING....");
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        } while (option != 7);
    }

   
    private static Person readPerson(Scanner sc) 
    {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
        Gender g = Gender.valueOf(sc.nextLine().toUpperCase());

        return new Person(name, age, g);
    }
}	 