// 5. Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

package wk9;
import java.util.ArrayList;
import java.util.Collection;
public class Two5 {
    public static void main(String[] args)
    {
        // Create an empty ArrayList.
        ArrayList myArrayList = new ArrayList();

        myArrayList.add("East Croydon");
        myArrayList.add("Selhurst");
        myArrayList.add("Thornton Heath");
        myArrayList.add("Norbury");
        myArrayList.add("Streatham common");
        myArrayList.add("Streatham");
        myArrayList.add("Tulse Hill");
        myArrayList.add("North Dulwich");
        myArrayList.add("East Dulwich");
        myArrayList.add("Peckham");
        myArrayList.add("Queens Road eckham");
        myArrayList.add("South Bermondsey");
        myArrayList.add("London Bridge");

        if (myArrayList.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        else
        {
            System.out.println("The ArrayList is not empty");
        }
    }
}
