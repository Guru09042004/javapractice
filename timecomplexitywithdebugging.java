public class timecomplexitywithdebugging {
    public static void main(String[] args) {
        int i;//,n=8;
        int sum=0;
        //        for(i=1;i<=n;i=i*2){
//            System.out.println("Hello world!!");
//        }
        //time complexity is O(n)..
//        for(i=2;i<=n;i=(int)Math.pow(i,2)) {
//            System.out.println("Hello world!!");
//     time complexity is O(log(log(n)))...
//       }

    //sum of array and avg of array
        int[]arr={1,7,9,11,12};
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
    double avg=sum/ arr.length;
        System.out.println(avg);
  }
}


