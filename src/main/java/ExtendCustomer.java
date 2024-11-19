public class ExtendCustomer extends Customer{
private int customerDiscountLevel;
    private int loyaltyPoints;

    public ExtendCustomer() {

    }

    public ExtendCustomer(String name, String address, String phone, int custNumber, boolean mailinglist, int loyaltypoints, int customerDiscountLevel) {
        super(name, address, phone, custNumber, mailinglist);
        this.loyaltyPoints = loyaltypoints;
        this.customerDiscountLevel = customerDiscountLevel;
    }
    private double discountLevel;

    // Constructor to initialize PreferredCustomer
    public ExtendCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    // Method to add loyalty points and update discount level
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    // Update discount level based on loyalty points
    private void updateDiscountLevel() {
        if (loyaltyPoints >= 1000) {
            this.discountLevel = 10.0;
        } else if (loyaltyPoints >= 500) {
            this.discountLevel = 5.0;
        } else {
            this.discountLevel = 0.0;
        }
    }

    // Getters for loyalty points and discount level
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }


    @Override
    public String toString() {
        return super.toString() +
                "loyaltypoints='" + loyaltyPoints + '\'' +
                "\nDiscount Level: " + discountLevel + "%";
    }

}
