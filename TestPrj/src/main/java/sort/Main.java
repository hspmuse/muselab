package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //private static int[] array = {6,4,9,3,2,1,8,7,5};

    public static void main(String[] args) {

        int[] array = {6,4,9,3,2,1,8,7,5};

        System.out.println(Arrays.toString(array));

        fn_bubble(array);

        System.out.println(Arrays.toString(array));
    }

    public static void fn_bubble(int[] array) {

        int temp;
        int cnt;
        for(int i=0; i<array.length; i++) {
            cnt = 0;
            for(int j=1; j<array.length-i; j++) {

                if(array[cnt] > array[j]) {
                    temp = array[cnt];
                    array[cnt] = array[j];
                    array[j] = temp;

                }
                cnt++;

            }
            System.out.println(Arrays.toString(array));

        }

    }



}
