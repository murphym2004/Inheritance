public class ExtendCustomer extends Customer{
private int loyaltypoints;
private int customerDiscountLevel;

    public ExtendCustomer() {

    }

    public ExtendCustomer(String name, String address, String phone, String custNumber, boolean mailinglist, int loyaltypoints, int customerDiscountLevel) {
        super(name, address, phone, custNumber, mailinglist);
        this.loyaltypoints = loyaltypoints;
        this.customerDiscountLevel = customerDiscountLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loyaltypoints='" + loyaltypoints + '\'' +
                ", customerDiscountLevel='" + customerDiscountLevel + '\'' +
                '}';
    }

    public int getLoyaltypoints() {
        return loyaltypoints;
    }

    public int getCustomerDiscountLevel() {
        return customerDiscountLevel;
    }

    public void setCustomerDiscountLevel(int customerDiscountLevel) {
        this.customerDiscountLevel = customerDiscountLevel;
    }

    public void setLoyaltypoints(int loyaltypoints) {
        this.loyaltypoints = loyaltypoints;
    }

}
