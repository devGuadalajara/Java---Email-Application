package emailapp;

import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLenght;
    private String department;
    private String companySuffix;
    private String email;
    private String altEmail;
    private int emailBoxCapacity;

    public Email ( String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        this.companySuffix = "myCompany.org";
        generateEmail();
        System.out.println( "Email created: " + this.email );
        this.defaultPasswordLenght = 12;
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
}
