package lesson3;

import lesson4.Circle;

/**
 * Created by user on 26.03.2017.
 */
//В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить и
//выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.

public class HW_3 {
    public static void main(String args[]){
    double a,b,c,x,x1,x2;
    a=1;
    b=-3;
    c=2;
    if ((b*b-4*a*c)<0) System.out.println("корней нет");
    if ((b*b-4*a*c)>0) System.out.println("x1= "+(x1=((-b+Math.sqrt(b*b-4*a*c))/2*a)));
                       System.out.println("x2= "+(x2=((-b-Math.sqrt(b*b-4*a*c))/2*a)));
    if ((b*b-4*a*c)==0)System.out.println("x1=x2= "+(x1=x2=(-b/(2*a))));

    }
}
