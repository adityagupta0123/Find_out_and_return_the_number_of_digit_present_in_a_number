package Recursion;

import java.util.Scanner;

public class previsionNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        System.out.println("Enter the Number to find Number Recursively :");
        int n = sc.nextInt();
        previsionNumber obj = new previsionNumber();
        System.out.println("Natural numbers till "+n+" : ");
        obj.number(n, 1);

    }
    int number(int a, int b){
        if (b <= a) {
            System.out.print(b + " ");
            return (number( a, ++b ));
        }
        return 1;
    }

}
