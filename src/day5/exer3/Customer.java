package day5.exer3;

public class Customer {
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    private String lastName;

    public void setAccount(Account account) {
        this.account = account;
    }

    private Account account;


}
