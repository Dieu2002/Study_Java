package Homework;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Mời bạn nhập số n: ");
        n=sc.nextInt();
        Uocso(n);
        lietKeUocSNT(n);
    }
    public static void Uocso(int number){
        int dem =0;
        System.out.println("Các ước số của "+ number +" là:" );
        for (int i =1; i <= number; i++){
            if( number % i == 0){
                System.out.print(" "+ i);
                dem+=1;
            }

        }
        System.out.println("\nCó "+ dem +" ước số của số "+ number);
    }

    public static boolean checkSNT(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void lietKeUocSNT(int n){
        int count=0;
        System.out.print("\nCác ước của "+n+" là số nguyên tố:");
        for(int i=1 ; i<=n ; i++){
            if(n%i==0 && (checkSNT(i))) {
                System.out.print(" "+i);
                count++;
            }
        }
        System.out.println("\nCó  "+count+" ước là số nguyên tố");
    }


}
