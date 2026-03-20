import java.util.Scanner;
class MethodCalling{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] arr = new int[500];

        System.out.print("Enter Your Frist Value:- ");
        int val1 = scan.nextInt();
        System.out.print("Enter Your Second Value:- ");
        int val2 = scan.nextInt();
        System.out.print("Enter Your Name:- ");
        String name = scan.next();

        getSum(val1 , val2 , name);
    }
    public static void getSum(int val1 , int val2 , String name) {

        System.out.println(val1 + val2 + name);
    }
}

