import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class java {
    static List<List<Integer>> mergeOverlaps(int arr[][]) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];

            int end = arr[i][1];
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (end >= arr[j][0]) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4 },
                { 3, 3 },
                { 3, 3 },
                { 3, 3 },
                { 3, 4 },
                { 4, 4 },
                { 5, 5 },
                { 5, 5 },
                { 5, 6 }
        };
        List<List<Integer>> ans = mergeOverlaps(arr);
        System.out.println(ans);
    }
}