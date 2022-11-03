package Practice;

import Practice.Complex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Complex t1 = new Complex();
        Complex t2 = new Complex();
        Complex chiaComplex = new Complex();

        // Nhap
        System.out.println("Nhap so phuc 1:");
        t1.nhap(sc);
        System.out.println("Nhap so phuc 2:");
        t2.nhap(sc);

        // print
        System.out.println("So phuc 1 la:");
        t1.print();
        System.out.println("So phuc 2 la:");
        t2.print();

        // Chia t1 cho t2
        chiaComplex = t1.chiaComplex(t2);

        // print
        System.out.println("Ket qua cua phep chia t1 cho t2 la:");
        chiaComplex.print();

        sc.close();
    }
}
