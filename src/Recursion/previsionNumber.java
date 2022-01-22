package Recursion;

import java.util.Scanner;

public class previsionNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        System.out.println("Enter the Number to find Number Recursively :");
        int n = sc.nextInt();

        System.out.println("Natural numbers till "+n+" : ");
        number(n, 1);
        System.out.println("\n==========");
        number(n);


    }
    public static void number(int n) {
        if (n == 0)
            return;
        number(n - 1);
        System.out.print(n + " ");
    }
    public static int number(int a, int b){
        if (b <= a) {
            System.out.print(b + " ");
            return (number( a, ++b ));
        }
        return 1;
    }

    }



