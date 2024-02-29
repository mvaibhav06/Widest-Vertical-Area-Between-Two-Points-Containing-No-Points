import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalArea {
    public static int maxWidth(int[][] points){
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                Integer a = o1[0];
                Integer b = o2[0];
                return a.compareTo(b);
            }
        };
        Arrays.sort(points, comparator);
        int out = 0;
        for (int i=1; i<points.length; i++){
            int diff = points[i][0] - points[i-1][0];
            if (diff > out){
                out = diff;
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(maxWidth(points));
    }
}
