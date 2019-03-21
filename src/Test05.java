import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        int index = Arrays.binarySearch(num,4);
        System.out.println("index is "+index);
        for (int n:num
             ) {
            System.out.println(n);
        }
        System.out.println(Arrays.toString(num));
        int []nums2 = {10,20,11,22,31,25};
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));;
    }
}
