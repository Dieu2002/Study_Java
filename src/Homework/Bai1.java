package Homework;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Mời bạn nhập số nguyên dương a: ");
        a = sc.nextInt();
        System.out.println( "Mời bạn nhập số nguyên dương b: ");
        b = sc.nextInt();
        // USCLN
        System.out.println("ước số chung lớn nhât của "+ a + " và "+ b +" là: "+USCLN(a,b));
        //BSCNN
        System.out.println("Bội số chung nhỏ nhất của "+ a + " và "+ b +" là: "+BSCNN(a,b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
