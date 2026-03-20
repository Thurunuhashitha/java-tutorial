import java.util.Scanner;
class Loop{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double tax=0.0;

        for(int i=0; i<3; i++){

            System.out.print("Enter Employe "+ (i+1) +" Salary :-");
            double salary = scan.nextDouble();

            if(salary>100000){
                tax = (salary*12)/100;
                System.out.println("Tax for employe "+(i+1)+" is:-"+tax);
                tax += tax;
            }

        }
        System.out.println("Goverment recive Taxs :- "+tax);
    }
}
