package lesson3;

/**
 * Created by user on 26.03.2017.
 */
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17;

public class HW_4 {
    public static void main(String args[]){
        int x=1,i;
        for(i=1; i <=55; i++) {
            System.out.print(x+" ");
            x=x+2;
        }
    }
}
