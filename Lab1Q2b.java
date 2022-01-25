public class Lab1Q2b {
    public static void main(String arg[])
    {
        String modulecode = "CSC1009";

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
    }
}
