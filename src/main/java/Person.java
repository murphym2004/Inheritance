public class Person {

    private String name;

    private String address;
    private String phone;

    public Person() {
    }

    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {

             return   "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
