package jihekuangjia;

import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestListMap
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1000, "b1", 30.5, "bjsxt");
        Book b1_1 = new Book(1000, "b1", 30, "bjsxt");
        Book b2 = new Book(1000, "b2", 50, "bjsxt");
        Book b3 = new Book(1001, "b3", 30.5, "bjsxt");
        Book b4 = new Book(1002, "b4", 30.5, "bjsxt");
        Book b5 = new Book(1003, "b5", 50, "bjsxt1");
        //使用HashSet存储图书并遍历
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b1_1);
        System.out.println("遍历输出hashset");
        System.out.println(bookList.size());
        for (Book book : bookList)
        {
            System.out.println(book.toString());
        }
        //使用TreeSet存储图书并遍历
        Map<Integer, Book> bookMap = new HashMap<Integer, Book>();
        bookMap.put(b1.getId(), b1);
        bookMap.put(b1.getId(), b1);
        bookMap.put(b2.getId(), b2);
        bookMap.put(b3.getId(), b3);
        bookMap.put(b4.getId(), b4);
        bookMap.put(b5.getId(), b5);
        bookMap.put(b1_1.getId(), b1_1);
        System.out.println("遍历输出treeset");
        for (java.util.Map.Entry<Integer, Book> entry : bookMap.entrySet())
        {
            System.out.println(entry.getKey() + "----------->" + entry.getValue());
        }
    }
}
