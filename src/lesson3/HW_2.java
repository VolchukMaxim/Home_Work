package lesson3;
/**
 * Created by user on 26.03.2017.
 */
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
public class HW_2 {
    public static void main(String args[]){
        double absm, absn,m,n;
        m=-1;
        n=26;

        absm = (10-m) < 0 ? -(10-m) : (10-m);
        absn = (10-n) < 0 ? -(10-n) : (10-n);
        if (absm==absn) System.out.println("данные переменные m="+m+" и n="+n+" одинаково расположены относительно числа 10 ");
        if (absm > absn)  System.out.println("ближайшая к 10 переменная n=" +n);
        else System.out.println("ближайшая к 10 переменная m=" +m);

    }
}
