package lesson3;

/**
 * Created by user on 26.03.2017.
 */
public class HW_6 {
    public static void main(String args[]) {
        int count = 0, hh , mm;
        for (hh = 0; hh < 24; hh++)
        {
            for ( mm= 0; mm < 60; mm++)
            {
                if (hh / 10 == mm % 10)
                {
                    if (hh % 10 == mm / 10) count++;
                }
            }
        }
        System.out.println(count);
    }
}







