// 3. Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.
package wk9;
import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
public class Two3 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        for(int i=1; i<=5; i++){
        color.add("White");}
        for(int i=1; i<=5; i++){
        color.add("Green");}
        for(int i=1; i<=5; i++){
        color.add("Yellow");}
        for(int i=1; i<=5; i++){
        color.add("Black");}
        for(int i=1; i<=5; i++){
        color.add("Red");}

        System.out.print(color);
    }
}