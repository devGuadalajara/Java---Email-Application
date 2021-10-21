package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String altEmail;
    private int emailBoxCapacity;

    public Email (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + firstName + " " + lastName);
    }
}
