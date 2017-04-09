package lesson4;

/**
 * Created by user on 01.04.2017.
 */
//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве чётных
//элементов и выведете это количество на экран на отдельной строке.
public class HW4_2 {

    public static void main(String[] args)  {
        int mass[] = new int[15];
        int count=0;
        //заполнение массива
        for (int i=0; i<15; i++) {
            mass[i] =(int)(Math.random()*9);
            System.out.print(mass[i] + " ");
            if (mass[i]%2==0) count++;
        }
        System.out.println();
        System.out.println(count);


    }
}
