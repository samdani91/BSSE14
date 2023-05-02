import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String information;
        information=sc.next();

        String[] temp=information.split(",");

        Customer one=new Customer(temp[0],temp[1],temp[2],temp[3]);

        one.print();

        //array to array list
        List<String>al=Arrays.asList(temp);
        System.out.println(al);

        //temp[2].replace();
        temp[2].replaceAll("^\\D","");
        System.out.println(temp[2]);



    }
}