package lesson4;

import java.util.Random;

/**
 * Created by user on 01.04.2017.
 */
public class HW4_3 {
    public static void main(String[] args){
        //массив зададий для учеников. Учеников 15, каждый получит свою строку. Задание у нас состоит из 2 множителей и их произведения, т.е. в каждой строке будет 3 элемента
        int [][] Mas = new int[15][3];
        //Заполним массив заданий
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                //Первым двум элементам строки (множителям) присвоим рандомные значения от 2 до 9
                Mas[i][h]=(int)(Math.random()*8)+2;
                //3 элемент - это результат умножения первых двух элементов строки
                if(h==Mas[i].length-1){
                    Mas[i][h]=Mas[i][h-2]*Mas[i][h-1];
                    //Проверим, нет ли среди уже свормированых заданий (строк), таких, которые по условиям задачи нельзя задавать другому ученику. Для этого переберем все результаты умножения (3 элементы) предыдущих строк.
                    for(int q=0;q<i;q++){
                        if(Mas[i][h]==Mas[q][h]&&i>0){
                            //Если мы нашли такую строку, надо убедиться, что множители в ней тоже совпадают. Для этого нам достаточно проверить совпадение одного множителя.
                            if(Mas[i][h-1]==Mas[q][h-1]||Mas[i][h-2]==Mas[q][h-2])
                                //Если мы находим такое совпадение - заполним элементы строки заново
                                --i;
                        }
                    }
                }
            }
        }
        //С помощью простого цикла выведем уже отобранные задания на экран
        for(int i=0;i<Mas.length;i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h=0;h<Mas[i].length;h++){
                if(h==0)
                    System.out.print(Mas[i][h]+" на ");
                if(h==1)
                    System.out.println(Mas[i][h]);
            }
        }
    }
}