//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * created by Freeze on 2019/1/13
// * see  https://leetcode-cn.com/articles/pancake-sorting
// **/
//public class BatterCake {
//
//    public static List<Integer> pancakeSort(int[] A) {
//        List<Integer> ans = new ArrayList();
//        int N = A.length;
//
//        Integer[] B = new Integer[N];
//        for (int i = 0; i < N; ++i)
//            B[i] = i + 1;
//        Arrays.sort(B, (i, j) -> A[j - 1] - A[i - 1]);
//
//        for (int i : B) {
//            for (int f : ans)
//                if (i <= f)
//                    i = f + 1 - i;
//            ans.add(i);
//            ans.add(N--);
//        }
//
//        return ans;
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {3, 2, 4, 1};
//        System.out.println(pancakeSort(a));
//    }
//}
