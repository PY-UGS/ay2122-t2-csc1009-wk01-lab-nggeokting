import java.util.Scanner;

public class Lab1Q2b {
    public static void main(String arg[])
    {
        System.out.print("Enter a module code: ");
        Scanner input = new Scanner(System.in);
        String modulecode = input.next();

        switch(modulecode)
        {
            case "CSC1007":
            System.out.println("Operating Systems");
            break;
            case "CSC1009":
            System.out.println("Object-Oriented Programming");
            break;
            default: 
            System.out.println("Unknown Module Code");
            break;
        }

        input.close();
    }
}
