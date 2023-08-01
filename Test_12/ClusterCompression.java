package Test_12;
/* 
 * Date: Aug 1, 2023
 * Created by davisbug
 * 
 */
public class ClusterCompression {
    public static int[ ] clusterCompression(int[ ] a){
        if (a.length == 0) {
            return new int[]{};
        }
        int numClusters = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                numClusters++;
            }
        }
        int[] result = new int[numClusters];
        if (numClusters == 1) {
            result[0] = a[0];
            return result;
        }
        int clusterIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                result[clusterIndex] = a[i];
                result[clusterIndex + 1] = a[i + 1];
                clusterIndex++;
            }
        }
        for (int i : result) {
            System.out.print(i+" ");  
        }
        return result;
    }

    public static void main(String[] args) {

        //Test  Cases
        int[] array = {8, 8, 6, 6, -2, -2, -2};
        System.out.println(clusterCompression(array));
        System.out.println(clusterCompression(new int[] {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1}));
    }

}
