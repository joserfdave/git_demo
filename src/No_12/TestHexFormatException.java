package No_12;
import java.util.Scanner;

public class TestHexFormatException
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Enter a hex string: ");
            HexToDecUseHexFormatException hex = 
                new HexToDecUseHexFormatException(input.next());
            System.out.println("The decimal value for hex number " 
                + hex.getHexString() + " is " + hex.hexToDec());
        }
        catch (HexFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}