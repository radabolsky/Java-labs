import java.util.Arrays;

/**
 * Laboratory work No. 1
 * @author Vladislav Radobolsky 0308
 * @version 01
 */


public class lab01 {
    static int[] a;
    /**
     * @param args string parameters passed to the program
     */
    public static void main(String[] args){
        a = new int[] {5, 4, 3, 0, 7, 2, 1, 9, 8, 6};
        int res, n;
        String output = String.format("Массив до обработки: %s", Arrays.toString(a));
        System.out.println(output);
        n = a.length;
        for (int i = 1; i < n; i++){
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--){
                res = a[j];
                a[j] = a[j - 1];
                a[j - 1] = res;
            }
        }
        output = String.format("Массив после обработки: %s", Arrays.toString(a));
        System.out.println(output);
    }
}
