import java.util.Arrays;
public class twoArrays {
    public void doEx(int[] a, int[] b) {
        for (int i = a.length - 1; i >= 0; i--)
            if (Arrays.binarySearch(b, a[i]) < 0)
                System.out.println(a[i]);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 4, 6};
        twoArrays twoArrays = new twoArrays();
        twoArrays.doEx(a, b);
    }
}
