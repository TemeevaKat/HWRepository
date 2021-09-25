import java.io.PrintStream;

public class HomeWork3 {


    public static void main(String[] args) {

                 invertArray();
                    fillArray();
                   changeArray();
       DiagonalArray(4);
        Array5(3,2);




    }


    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void invertArray() {
        int[] arr = {1, 0, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");


        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");

        }
    }
    public static void DiagonalArray(int size) {

        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                table[i][i] = 1;
                table[i][size - i - 1] = 1;
                System.out.print(table[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[] Array5(int len, int initValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;


        }


        return tempArray;

    }

   }












