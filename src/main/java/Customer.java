public class Customer extends Person{
    private String custNumber;
    private boolean mailinglist;

    public Customer()
    {
        this.custNumber = "";
        this.mailinglist = false;
    }

    public Customer(String name, String address, String phone, String custNumber, boolean mailinglist) {
        super(name, address, phone);
        this.custNumber = custNumber;
        this.mailinglist = mailinglist;
    }

    @Override
    public String toString() {
        return super.toString() +
                "custNumber='" + custNumber + '\'' +
                ", mailinglist=" + mailinglist +
                '}';
    }
}
