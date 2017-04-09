package lesson4;

/**
 * Created by user on 01.04.2017.
 */
public class HW4_4 {
    public static void main(String[] args) {
        int[][] Mas = new int[6][7];
        for (int i = 0; i < Mas.length; i++) {
            for (int h = 0; h < Mas[i].length; h++) {
                Mas[i][h] = (int) (Math.random() * 9);
                System.out.print(Mas[i][h] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < Mas.length; i++) {
            for (int h = 0; h < 7; h++) {
                int max = Mas[i][h];
                int hmax = h;

                for (int j = h + 1; j < 7; j++) {

                    if (Mas[i][j] > max) {
                        max = Mas[i][j];
                        hmax = j;
                    }
                }

                if (h != hmax) {
                    int temp = Mas[i][h];
                    Mas[i][h] = Mas[i][hmax];
                    Mas[i][hmax] = temp;
                }

            }
        }
    }
}