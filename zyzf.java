import java.util.*;

public class zyzf {
    public static void main(String[] args) {
        final int kolvo_proverok = 50000000;
        
        for (int kolvo = 1000; kolvo < 100000; kolvo += 1000) {
            long memObjNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            //Tree tree = new Tree();
            int[] massZn = new int[kolvo];
            long memObj = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            //long time_m;
            //long time_t;
            
            Random rand = new Random();
            int value[] = new int[kolvo];
            for (int i = 0; i < kolvo; i++) {
                value[i] = rand.nextInt(100);
            }

            long memNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            for (int i = 0; i < kolvo; i++) {
                //tree.insertNode(value[i]);
                massZn[i] = value[i];
            }

            for (int i = 0; i < kolvo_proverok; i++) {
                Arrays.binarySearch(massZn, value[753]);
            }
            long mem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            Arrays.sort(massZn);

            // int[] values = new int[kolvo_proverok];
            // for (int i = 0; i < kolvo_proverok; i++) {
            //     values[i] = rand.nextInt(100);
            // }

            // long timeNow = System.currentTimeMillis();
            // for (int i = 0; i < kolvo_proverok; i++) {
            //     Arrays.binarySearch(massZn, values[i]);
            // }
            // time_m = System.currentTimeMillis() - timeNow;

            // long timeNow = System.currentTimeMillis();
            // for (int i = 0; i < kolvo_proverok; i++) {
            //     tree.findNodeByValue(values[i]);
            // }
            // time_t = System.currentTimeMillis() - timeNow;

            //System.out.println(time_m);
            //System.out.println(time_t);
            System.out.println(((mem-memNow)/1024) + ((memObj-memObjNow)/1024));
        }
    }
}