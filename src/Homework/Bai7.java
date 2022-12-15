package Homework;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Mời bạn nhập số n: ");
        n=sc.nextInt();
        TinhTong(n);
        ThuasoNT(n);
    }
    public static void TinhTong(int n){
        int soDu, tong =0;
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }
        System.out.println("Tổng các chữ số = " + tong);
    }
    public static void ThuasoNT(int b){
        System.out.print("\nCác thừa số của nguyên tố "+ b +" là: ");
        for(int i=2; i<=b;i++)
        {
            while(b%i==0)

            {
                b=b/i;
                if(b==1)
                    System.out.print(i);
                else
                    System.out.print(i+" x ");
            }
            if (b==1)
                break;
        }
    }

}
