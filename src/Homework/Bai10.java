package Homework;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai10 {
    public static String doiViTri(String strInput){
        String str= Bai10a.chuanHoa(strInput);
        StringTokenizer strToken= new StringTokenizer(str," ");
        String ho    = strToken.nextToken();
        String hoDem = strToken.nextToken();
        String ten   = strToken.nextToken();
        String strOutput= ten+" "+ho+" "+hoDem;
        return(strOutput);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập họ và tên của bạn : ");
        String strInput= input.nextLine();
        System.out.println("Họ và tên của bạn sau khi đã được sắp xếp lại:  "+doiViTri(strInput));

    }
}
