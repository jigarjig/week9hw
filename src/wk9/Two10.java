// 10. Write program and add all group members names in to array and iterates
//through for each loop and print your name.
package wk9;

public class Two10 {
    public static void main(String[] args) {

        String[] group = {"Jigar","Arpita","Shivam","Dhwanil","Akshit"};
        System.out.println(group[0]);
        System.out.println(
                "iterating over an array using forEach() loop in Java:");
        for (String var : group) { // syntax forEach() loop)
            // var is variable.
            System.out.println(var) ;
           //System.out.println(group[0]);
        }
    }
}
