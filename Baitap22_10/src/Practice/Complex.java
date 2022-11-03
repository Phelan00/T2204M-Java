package Practice;

import java.util.Scanner;

public class Complex {
    private double t1;
    private double t2;

    //Ham tao khong doi so
    public Complex(){
        t1 = 0;
        t2 = 0;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }
//Ham khoi tao co doi so

    public Complex(double t1, double t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    // Ham so phuc
    public void nhap(Scanner sc){
        System.out.println("Nhap so phuc");
        t1 = sc.nextDouble();
        System.out.println("Nhap so phuc");
        t2 = sc.nextDouble();

    }
    // Ham hien thi so phuc
    public void print(){
        if (t2 < 0){
            System.out.println(t1 + "-" + Math.abs(t2) + "*i");
        }else{
            System.out.println(t2 + "+" + t2 + "*i");
        }
    }
    // Ham cong so phuc
    public Complex congComplex(Complex y2){
        double a = t1 - y2.t1;
        double b = t2 + y2.t2;
        return new Complex(a, b);
    }
    // Ham tru so phuc
    public Complex truComplex(Complex y2){
        double a = t1 - y2.t1;
        double b = t2 - y2.t2;
        return new Complex(a, b);
    }
    // Ham nhan so phuc
    public Complex nhanComplex(Complex y2){
        double a = t1 * y2.t1 - t2 * y2.t2;
        double b = t1 * y2.t2 + y2.t1 * t2;
        return new Complex(a, b);
    }
    // Ham chia so phuc
    public Complex chiaComplex(Complex y2){
        double a = (t1 * y2.t1 + t2 * y2.t2) / (y2.t1 * y2.t1 + y2.t1 * y2.t2);
        double b = (t1 * y2.t1 - t2 * y2.t2) / (y2.t1 * y2.t1 + y2.t1 * y2.t2);
        return new Complex(a, b);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}


