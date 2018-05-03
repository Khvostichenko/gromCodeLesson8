package lesson8.homeTask1;

public class Arithmetic {
    boolean check(int[] array){
        int min = array[0], max = array[0];

        for(int a : array){
            if(min > a)
                min = a;

            if(max < a)
                max = a;
        }

        if((max + min) > 100)
            return true;
        else
            return false;
    }
}
