package Homework;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 xâu kí tự: ");
        String input=sc.nextLine();
        StringTokenizer strChuoi = new StringTokenizer(input," ");
        System.out.println("Số các từ trong sâu là: "+strChuoi.countTokens());
    }
}
