import java.util.Scanner;

public class namewithage {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      // to access the method from scanner using obj.
        //user give name ..
        System.out.print("Enter your name : ");
      String name = scanner.nextLine() ;
      System.out.println("My name  is " + name );
      //user give age ...
        System.out.print("Enter your age : ");

        int age = scanner.nextInt();
        //here we add name then attach with age..
        System.out.println(name + "age is " + age );

    }

}
