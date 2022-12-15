package Homework;

import java.util.Scanner;

public class Fibonaciic2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n ");
        int nhap=sc.nextInt();
        int[] f= new int[nhap+1];
        f[0]= 1; f[1]= 1;
        for(int i=2;i<=nhap;i++){
            f[i]= f[i-1]+f[i-2];
        }
        System.out.println("So Fibonanci thu "+nhap+" la: f["+nhap+"]= "+f[nhap]);
    }


}
