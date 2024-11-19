import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scan.nextLine();
        System.out.println("please enter your address");
        String address = scan.nextLine();
        System.out.println("enter your number");
        String phone = scan.nextLine();
        System.out.println("please enter customer number");
        int custnum = Integer.parseInt(scan.nextLine());
        System.out.println("do you want to be on the mailing list");
        boolean list = scan.hasNextBoolean();

        // Create a Customer instance
        Customer newcust = new Customer(name, address, phone, custnum, list);
        System.out.println("You entered: ");
        System.out.println(newcust);

        // Create and test PreferredCustomer
        ExtendCustomer preferredCustomer2 = new ExtendCustomer("Paul", "ATU", "091 775678", 1002, false);

        // Add loyalty points and display
        preferredCustomer2.addLoyaltyPoints(700);
        System.out.println(preferredCustomer2);

        preferredCustomer2.addLoyaltyPoints(800);
        System.out.println(preferredCustomer2);
        scan.close();


    }
    }

