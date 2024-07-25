import java.util.Scanner;

public class printnaturalnumberandadd {
    public static void main (String[]args){
        int num = 10;
        int n = 1;
        int m = 1;
        int m2 = 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 =0;
        // while loop
        while(n<=num) {

            System.out.print(n + " ");

            sum = sum + n;
            n++;
        }
        System.out.println();
        System.out.println("total  " + sum);
        //do whlie
        do {
            System.out.print(m  + " ");
            sum2=sum2+m;
            m++;
        }
        while(m<=num);
        System.out.println();
        System.out.println("total "+sum2);
        //ulta do while
        do {
            System.out.print(num + " ");
            sum3 = sum3+num;
            num--;
        }
        while(num>=m2);
        System.out.println();
        System.out.println("total "+ sum3);
        //for loop
        for(int i=1;i<=10;i++)
        {
            System.out.print(i +" ");
            sum1=sum1+i;
        }
        System.out.println();
        System.out.println("total "+ sum1);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value  ");
        int h = sc.nextInt();
        String  val = (h%2)==0? "even":"odd";
        System.out.println(val);

    }
}
