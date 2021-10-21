package emailapp;

import java.util.Scanner;

public class Email
{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String altEmail;
    private int emailBoxCapacity;

    public Email ( String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println( "Email created: " + firstName + " " + lastName );

        this.department = setDepartment();
        generateEmail();
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
        System.out.println( this.firstName + "." +
                            this.lastName  + "@" +
                            this.department
        );
    }
}
