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
        String custnum = scan.nextLine();
        System.out.println("do you want to be on the mailing list");
        boolean list = scan.hasNextBoolean();

        Customer newcust = new Customer(name,address,phone,custnum,list);
        System.out.println("you entered "+ newcust.toString());

        ExtendCustomer preferedcustomer = new ExtendCustomer();
       preferedcustomer.setLoyaltypoints(600);
        System.out.println(preferedcustomer);


        if (preferedcustomer > 500 && preferedcustomer > 1000){
            preferedcustomer.setCustomerDiscountLevel(5);
            System.out.println(preferedcustomer);
            System.out.println("your discount is " + preferedcustomer);

        }
    }
}
