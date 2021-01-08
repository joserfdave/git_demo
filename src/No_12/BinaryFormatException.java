package No_12;
public class  BinaryFormatException extends Exception
{
    String binString;

    public BinaryFormatException(String binString)
    {
        super(binString);
        this.binString = binString;
    }

    public String getBinString()
    {
        return binString;
    }
}
