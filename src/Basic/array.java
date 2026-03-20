import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] arr = new int[10];
        double allSalary=0;

        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter your Employ "+(i+1)+" Salary :-");
            arr[i] = scan.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            System.out.println("Employ "+(i+1)+" Salary Is:- "+arr[i]);
            allSalary += arr[i];
        }
        System.out.println("All Employ Salary is :-"+allSalary);
    }
}
