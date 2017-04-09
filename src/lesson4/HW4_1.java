package lesson4;

/**
 * Created by user on 01.04.2017.
 */
//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите на экран
  //      тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class HW4_1 {
    public static void main(String[] args) {
        int[] arrInt = new int[51];
       for (int i = 1; i < arrInt.length; ++i){
           // arrInt[0] = 1;
            arrInt [i]=i*2-1;
        //for (int i = 1; i < arrInt.length; i++)
            System.out.print(arrInt[i] + " ");
       }
        System.out.println();
        for (int i = 50; i>0; --i) {
            System.out.print(arrInt[i] + " ");
        }

    }
}