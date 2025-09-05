import java.util.Scanner;

public class Pracfun {
    public static void main(String[] args) {
//        Scanner in = new  Scanner(System.in);
//        int a =in.nextInt();
//        prime(a);
//        int a=153;
        armstrong();
    }



//    static  void prime(int a){
//        if(a==1){
//            System.out.println("it is prime number ");
//            return ;
//        } else if (a==2&&a==3) {
//            System.out.println("it is prime  number ");
//        }
//        for(int i=2;i<a;i++){
//            if(a%i==0){
//                System.out.println("it is not prime number");
//                return;
//            }
//        }
//        System.out.println("it is prime number ");
//    }



    static void armstrong(){
        for (int a=100;a<1000;a++) {
            int temp = a;
            int check = a;
            int power = 0;
            double ans = 0;
            int temp2 =a;
            while (temp2 > 0) {
                int digit = temp2 % 10;
                power++;
                temp2 = temp2 / 10;
            }
            while (temp > 0) {
                int digit = temp % 10;
                int sub = 1;

//           ans=ans+Math.pow(digit,power);
                for (int i = 0; i < power; i++) {
                    sub *= digit;

                }
                temp = temp / 10;
                ans = ans + sub;

            }

            if (check == ans) {
//                System.out.println("yes");
                System.out.println(ans);
            }
        }
//       else System.out.println("it is not armstrong");
    }


}
