package emailapp;

import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String altEmail;
    final String companySuffix = "myCompany.org";
    final int defaultPasswordLenght = 12;
    private int emailBoxCapacity;

    public Email ( String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        generateEmail();
        System.out.println( "Email created: " + this.email );
        this.password = randomPassword( defaultPasswordLenght );
        System.out.println( "Your password is: " + this.password );
    }

    private String setDepartment()
    {
        System.out.print( "Enter a department:\n1) Sales \n2) Development \n3) Accounting\n0) none\n>" );
        Scanner in = new Scanner( System.in );
        int departmentChoice = in.nextInt();
        String department;

        if( departmentChoice == 1) department = "Sales";
        else if ( departmentChoice == 2 ) department = "Development";
        else if ( departmentChoice == 3 ) department = "Accounting";
        else department = "";

        return department;
    }

    private void generateEmail()
    {
        this.email = this.firstName  + "." +
                     this.lastName   + "@" +
                     this.department + "." +
                     this.companySuffix;

        this.email = this.email.toLowerCase();
    }

    private String randomPassword( int length )
    {
        String setAlphabetCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String setAlphabetLower = setAlphabetCaps.toLowerCase();
        String specialChars = "0123456789_-,;.%$/()?!¡¿@";
        String fullSet = setAlphabetCaps + setAlphabetLower + specialChars;

        char[] password = new char[length];
        for( int index = 0; index < length; index++ )
        {
            int randomChar = (int) ( Math.random() * fullSet.length() );
            password[index] = fullSet.charAt( randomChar );
        }

        return new String ( password );
    }

    //Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPassword() { return password; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
    public String getAltEmail() { return altEmail; }
    public int getEmailBoxCapacity() { return emailBoxCapacity; }

    public void getAllInfo()
    {
        System.out.println( this.firstName );
        System.out.println( this.lastName );
        System.out.println( this.department );
        System.out.println( this.email );
        System.out.println( this.password );
        System.out.println( this.altEmail );
        System.out.println( this.emailBoxCapacity );
    }

    //Setters
    public void setAltEmail( String altEmail ) { this.altEmail = altEmail; }
    public void setEmailBoxCapacity( int emailBoxCapacity )
    { this.emailBoxCapacity = emailBoxCapacity * 1000; }
    public void setPassword( String password ) { this.password = password; }

}
