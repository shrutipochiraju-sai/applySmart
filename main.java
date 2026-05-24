import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== ApplySmart =====");
        System.out.println("1. Add Application");
        System.out.println("2. View Applications");
        System.out.println("3. Exit");
        System.out.print("Which option would you like to select?");

        Scanner scnr = new Scanner(System.in);
        int user = scnr.nextInt();
        
    if (user == 1){
        System.out.println("Adding application..");
        scnr.nextLine();
        System.out.print(" Company name: ");
        String company = scnr.nextLine();
        System.out.print(" Role: ");
        String role = scnr.nextLine();
         System.out.print(" Status:");
        String status = scnr.nextLine();
        System.out.print(" Category: ");
        String category = scnr.nextLine();

        System.out.println("Application 1:");
        System.out.println( "Company: " + company);
        System.out.println( "Role: " + role);
        System.out.println( "Status: " + status);
        System.out.println( "Category: " + category);

        System.out.println("Application has been successfully added!");
    }
    else if (user == 2){
        System.out.println("View Applications list");
        
    }
    else {
        System.exit(0);
    }
    scnr.close();
    }

}
