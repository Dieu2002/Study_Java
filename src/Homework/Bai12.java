package Homework;

import java.util.Scanner;

public class Bai12 {
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Bạn phải nhập lại số...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int countElement(int a[], int n, int i){
        int count= 0;
        for(int j=0 ; j<n ; j++){
            if(a[j]== i)
                count ++;
        }
        return (count);
    }
    public static void main(String[] args) {
        int n,i;
        System.out.println("Mời bạn nhập n= ");
        n= nhap();
        int[] array= new int[n];
        for(i=0 ; i<n ; i++){
            System.out.println("Nhập phần tử thứ  " +(i+1)+" ");
            array[i]= nhap();
        }
        System.out.print("Các phần tử xuất hiện 2 lần trong dãy là : ");
        for(i=0 ; i<n ; i++){
            if(countElement(array, n, array[i])==2 && countElement(array, i, array[i])==0){
                System.out.print(" "+array[i]);
            }
        }
    }

}
