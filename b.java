//Imported Libraries
import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;
import java.util.Vector;
import java.util.Arrays;
import java.util.Scanner;

class b{
    public static void main(String args[]){
        //Size of an ArrayList
        Account[] account = new Account[100];
        //Variables being used
        String a, b, c;
        double z;
        int cha;
        do{
            //The menu to choose
            Scanner s = new Scanner(System.in);
            System.out.println("Hello there my name is Josh your virtual assistant!");
            System.out.println("Please choose the following options: ");
            System.out.println("1. Add/Display Students/Calculate GPA");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            cha = s.nextInt();
            elem e = new elem();
            //Switch Statements to redirect people
            switch (cha){
                case 1:
                e.add();
                break;
                case 4:
                e.endD();
                break;
            }//end of switch
        }while(cha != 4);
        System.out.println("Ending Transmission...");//main
    } //end of class atm
}
class Account{
    String firstname, lastname, id;
    double gpa;
    //Consttructor with parameters to store into variables
    Account(String f, String l, String i, double g)
    {
        firstname = f;
        lastname = l;
        id = i;
        gpa = g;

    }
    //Default Constructor
    Account()
    {
        firstname = "";
        lastname = "";
        id = "";
        gpa = 0;
    }
}

class elem extends Account{
    int a;
    double y;
    double count = 1;
    double total = 0;
    void endD()
    {
        System.out.println("\nI hope you have a nice day");
    }
    void add()
    {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student want to create: ");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter details of student "+(i+1));
            System.out.print("First Name: ");
            firstname = sc.next();
            System.out.print("Last Name: ");
            lastname = sc.next();
            System.out.print("ID: ");
            id = sc.next();
            System.out.print("GPA: ");
            gpa = sc.nextDouble();
            accounts[i] = new Account(firstname, lastname, id, gpa);
            counter++;
            //System.out.println(accounts[i].firstname);
        }
        do {

            Scanner s = new Scanner(System.in);
            System.out.println("Do you wish to print out the names (1) or Calculate the over GPA (2) or Exit (3)");
            a = s.nextInt();
            //Switch Statements to pprint or calculate
            switch (a){
                case 1:
                for (int x = 0; x < counter ; x++ )
                {
                    System.out.println("Firstname: "+ accounts[x].firstname + ", Lastname: " + accounts[x].lastname +", ID: " + accounts[x].id + ", GPA: " +accounts[x].gpa);
                }
                break;
                case 2:
                {
                    for(int x = 0; x < counter ; x++)
                    {
                        total += accounts[x].gpa;
                        count++;
                    }
                    y = y + (total/count);
                    System.out.println("The Average GPA: " + y);
                    for (int x = 0; x < counter ; x++ )
                    {
                        System.out.println("Firstname: "+ accounts[x].firstname + ", Lastname: " + accounts[x].lastname +", ID: " + accounts[x].id + ", GPA: " +accounts[x].gpa);
                    }
                }
                break;
                case 3:
                break;
            }
        } while (a != 3);
    }

}
