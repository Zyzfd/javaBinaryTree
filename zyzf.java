import java.util.*;

public class zyzf {
    public static void main(String[] args) {
        final int kolvo_proverok = 50000000;
        
        for (int kolvo = 1000; kolvo < 100000; kolvo += 1000) {
            Tree tree = new Tree();

            long time_m;
            //long time_t;

            int[] massZn = new int[kolvo];
            Random rand = new Random();
            for (int i = 0; i < kolvo; i++) {
                int value = rand.nextInt(100);
                //tree.insertNode(value);
                massZn[i] = value;
            }

            Arrays.sort(massZn);

            int[] values = new int[kolvo_proverok];
            for (int i = 0; i < kolvo_proverok; i++) {
                values[i] = rand.nextInt(100);
            }

            long timeNow = System.currentTimeMillis();
            for (int i = 0; i < kolvo_proverok; i++) {
                Arrays.binarySearch(massZn, values[i]);
            }
            time_m = System.currentTimeMillis() - timeNow;

            // long timeNow = System.currentTimeMillis();
            // for (int i = 0; i < kolvo_proverok; i++) {
            //     tree.findNodeByValue(values[i]);
            // }
            // time_t = System.currentTimeMillis() - timeNow;

            System.out.println(time_m);
            //System.out.println(time_t);
        }
    }
}