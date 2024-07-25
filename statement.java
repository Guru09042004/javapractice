public class statement {
    public static void main(String[] args) {
        int num = 10;
        int num1 =10;
        int i = 1;
        int j = 1;
        int k=1;
        //find even in series 1 to 10
        for (i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("even "+i);
            }
            else {
                continue;
               // System.out.println("odd "+i);
            }
        }
        //break using..
        for (j = 1; j <= num1; j++) {
            if (j == 7) {

                break;
            }
            System.out.println(j);
        }
    }
}
