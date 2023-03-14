import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 6, 8, 4, 9, 9, 6};
        int[] duplicate = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if ((i != k) && (array[i] == array[k]) && (array[i] % 2 == 0)) {
                    if (!isFind(duplicate,array[i]))
                    duplicate[startIndex++]=array[i];
                }
            }
        }
        System.out.print("Tekrar eden sayılar :");
        for (int value: duplicate){
            if (value !=0){
                System.out.print(" "+value);
            }
        }

    }
}