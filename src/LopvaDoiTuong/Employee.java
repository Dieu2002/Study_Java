package LopvaDoiTuong;

import java.util.Scanner;

public class Employee{
    String FirstName, LastName;
    double salary;


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void Employee(String firstName, String lastName, double salary) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn thông tin của nhân viên thứ: " + i);
            System.out.println("Mời bạn nhập họ: ");
            String firstname = sc.nextLine();
            System.out.println("Mời bạn nhập tên ");
            String lastname = sc.nextLine();
            System.out.println("Mời bạn nhập lương: ");
            double salary = sc.nextDouble();
        }

//        System.out.println("Họ và tên của nhân viên là: "+ firstname + lastname + "\nLương của nhân viên này là: "+salary + "vnd");
    }

//    public static int checkSalary(double salary) {
//        // check khi salary co gia tri am
//        if (salary < 0) {
//        }
//        //
//
//    }

}


