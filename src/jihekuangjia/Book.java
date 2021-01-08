package jihekuangjia;

public class Book
{
    public int id;
    public String name;
    public double price;
    public String press;
    public Book()
    {
        super();
    }
    public Book(int id, String name, double price, String press)
    {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.press = press;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getPress()
    {
        return press;
    }
    public void setPress(String press)
    {
        this.press = press;
    }
    @Override
    public String toString()
    {
        return "Book [id=" + id + ", name=" + name + ", press=" + press
                + ", price=" + price + "]";
    }
}

