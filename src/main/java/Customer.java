public class Customer extends Person{
    private int custNumber;
    private boolean mailinglist;

    public Customer()
    {
        this.custNumber = Integer.parseInt("");
        this.mailinglist = false;
    }

    public Customer(String name, String address, String phone, int custNumber, boolean mailinglist) {
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
