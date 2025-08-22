import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
       var main = new Main();
       var arr = new int[] {1,1,1,2,2,3,3,3,3};
       main.twoPointers(arr);
    }

    public void twoPointers(int[] arr) {
        var left = 0;
        var right = left + 1;

        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                arr[++left] = arr[right];
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
}