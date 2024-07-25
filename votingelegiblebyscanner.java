import java.util.Scanner;

public class votingelegiblebyscanner {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yuor age: ");
        int age = sc.nextInt();
        int b = 17;
        String val = (age > b) ? "You can vote" : "You can't";
        System.out.println(val);
    }
}

