package ex22;

import java.util.Scanner;

/*
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
 */


public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            return;
        }else{
            if(num1 > num2 && num1 > num3){
                System.out.printf("The largest number is %d.\n", num1);
            }else if(num2 > num1 && num2 > num3){
                System.out.printf("The largest number is %d.\n", num2);
            }else{
                System.out.printf("The largest number is %d.\n", num3);
            }
        }

    }
}
