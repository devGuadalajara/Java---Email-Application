package emailapp;

public class EmailApp
{
    public static void main(String[] args)
    {
        Email employee1 = new Email( "Jose", "Gomez");
        employee1.setAltEmail( "devjose@company.com");
        employee1.setEmailBoxCapacity(200);
        employee1.setPassword( "Hey" );

        employee1.getAllInfo();
    }
}
