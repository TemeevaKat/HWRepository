public class HomeWork2 {
    public static void main(String[] args) {
        Summ (5, 8 );
        PositiveOrNegative(- 5);
        metod3(5);
        printText("qwerty", 3 );

    }
    public static boolean Summ(int a, int b) {
        int result;
        result = a + b;
        if( result >= 10 && result < 20) return false;
        else return false;
    }


    public static void PositiveOrNegative(int a) {
        if ( a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    public static boolean metod3(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
    public static void printText(String text, int tree) {
        for (int i=1; i <= tree; i++) {
            System.out.println(text);
        }

    }





}
