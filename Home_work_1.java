// Урок 1. Знакомство с языком программирования Java
 
import java.util.Arrays;
import java.util.Random;

public class Home_work_1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println("i = " + i);                       // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        System.out.println(Integer.toBinaryString(i));

        int n = Integer.toBinaryString(i).length();
        System.out.println("n = " + n);                       // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int count = 0;
        int j = 0;
        int k = 0;
        for (j = i; j < (Short.MAX_VALUE - i); j++) { // получаем длину массива - count
            if ((j % n) == 0) {
                count ++;
            }
        }
        int[] m1 = new int[count];                    //  3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        System.out.println("count = " + count);
        for (j = i; j <= (Short.MAX_VALUE - i); j++) {
            if ((j % n) == 0) {
                m1[k] = j;
                k ++;
                if (k == count) {
                    break;
                }
            }
        }           
        System.out.println(Arrays.toString(m1)); 

        j = 0;
        k = 0;
        int[] m2 = new int[count];                    //  4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        for (j = -i; j >= (Short.MIN_VALUE - i); j--) {
            if ((j % n) != 0) {
                m2[k] = j;
                k ++;
                if (k == count) {
                    break;
                }
            }
        }           
        System.out.println(Arrays.toString(m2)); 
}
}
